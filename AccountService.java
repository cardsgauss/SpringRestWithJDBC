package com.scb.gauss.service;

import java.util.List;

import com.scb.gauss.bean.Account;

public interface AccountService {
void insertAccounts(List<Account> accounts);
void getAllAccounts();
void createAccount(Account acc);
void getAccountById(int accId);
}
