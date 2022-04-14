package com.kishore.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class DemoApplication {


       @RequestMapping("/")
       @ResponseBody
       String home() {
          return "Welcome to Azure";
       }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
