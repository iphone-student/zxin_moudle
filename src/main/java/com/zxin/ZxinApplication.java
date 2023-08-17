
package com.zxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = {""})
@SpringBootApplication
public class ZxinApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZxinApplication.class, args);
	}

}
