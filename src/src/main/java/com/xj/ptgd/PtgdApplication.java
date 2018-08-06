package com.xj.ptgd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@MapperScan("com.xj.ptgd.dao")//将项目中对应的dao类的路径加进来就可以了
public class PtgdApplication {

    public static void main(String[] args) {
        SpringApplication.run(PtgdApplication.class, args);
    }
    /**
     * 文件上传配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //单个文件最大
        factory.setMaxFileSize("20MB"); //KB,MB  -1不做限制
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("200MB"); //-1不做限制
        return factory.createMultipartConfig();
    }
}
