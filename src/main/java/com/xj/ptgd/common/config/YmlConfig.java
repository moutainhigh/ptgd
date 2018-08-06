package com.xj.ptgd.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@Configuration
public class YmlConfig {
    @Autowired
    private Environment _environment;

    /*文件上传路径*/
    public static String UP_FILE_PATH;
    public static String DOWNLOAD_FILE_PATH;

    @PostConstruct
    public void initialization() {
        //sms server
        UP_FILE_PATH = _environment.getProperty("fileConfig.upFilePath");
        DOWNLOAD_FILE_PATH = _environment.getProperty("fileConfig.downloadFilePath");

    }
}
