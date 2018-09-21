package com.xiaoi.document.split;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ServletComponentScan
@EnableCaching
@SpringBootApplication
public class DocumentSplitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentSplitApplication.class, args);
	}
}