package com.tailor.picturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.tailor.picturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class TailorPictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(TailorPictureApplication.class, args);

    }

}
