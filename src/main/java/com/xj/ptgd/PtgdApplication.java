package com.xj.ptgd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xj.ptgd.dao")//将项目中对应的dao类的路径加进来就可以了
public class PtgdApplication {

    public static void main(String[] args) {
        SpringApplication.run(PtgdApplication.class, args);
    }
}
