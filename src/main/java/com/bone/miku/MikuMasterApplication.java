package com.bone.miku;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.bone.miku.**.dao" })
public class MikuMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MikuMasterApplication.class, args);
	}

}
