package com.zw.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * http://localhost:2002/hystrix
 * @author Administrator
 *
 */
//启用 Hystrix Dashboard 功能
@EnableHystrixDashboard
@SpringBootApplication
public class SpringcloudHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudHystrixApplication.class, args);
	}
}
//http://localhost:9000/hystrix.strearm
//http://localhost:9000/hystrix.stream