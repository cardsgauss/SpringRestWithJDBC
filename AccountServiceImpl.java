package com.scb.gauss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.scb.gauss.bean.Account;
import com.scb.gauss.dao.AccountDAO;
import com.scb.gauss.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDAO accDAO;

	@Override
	public void createAccount(Account acc) {
		accDAO.createAccount(acc);
	}


	@Override
	public void insertAccounts(List<Account> accounts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllAccounts() {
		List<Account> accounts = accDAO.getAllAccounts();
		for (Account account : accounts) 
			System.out.println(account.toString());
		
		
	}


	@Override
	public void getAccountById(int accId) {
		Account account = accDAO.getAccountById(accId);
		System.out.println(account.toString());
		
	}

}
