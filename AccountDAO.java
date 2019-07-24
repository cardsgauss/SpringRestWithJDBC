package com.scb.gauss.dao;

import java.util.List;

import com.scb.gauss.bean.Account;


public interface AccountDAO {
public void createAccount(Account acc);
public List<Account> getAllAccounts();
Account getAccountById(int accId);
void insertAccounts(List<Account> accounts);
}
