package com.scb.gauss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.scb.gauss.bean.Account;
import com.scb.gauss.service.AccountService;

@SpringBootApplication
public class SpringRestWithJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringRestWithJdbcApplication.class, args);
		AccountService accService=context.getBean(AccountService.class);
		Account accOne=new Account(12598,"Saving",34560);
		accService.createAccount(accOne);
		accService.getAllAccounts();
		accService.getAccountById(125);
	}

}
