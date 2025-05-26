package com.wulang.wulangimagelibrarybackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.wulang.wulangimagelibrarybackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class WulangImageLibraryBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WulangImageLibraryBackendApplication.class, args);
    }

}
