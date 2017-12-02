package com.park;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ServletComponentScan
public class FirstjdbcApplication {
//	@Autowired
//	User_infoDao user_infoDao;
//	@Autowired
//	UserInfoBiz userInfoBiz;
//	@RequestMapping("/")
//	String home() throws Exception {
//		User_info user_info = userInfoBiz.returnUserInfo();
//		return "电话号码是：" + user_info.ui_tel;
//	}
	public static void main(String[] args) {
		SpringApplication.run(FirstjdbcApplication.class, args);
	}
}
