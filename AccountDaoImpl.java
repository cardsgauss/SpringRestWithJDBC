package com.scb.gauss.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

//import org.omg.CORBA.INITIALIZE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.scb.gauss.bean.Account;
import com.scb.gauss.dao.AccountDAO;




@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDAO {
	
	@Autowired
	DataSource datasource;

	@PostConstruct
	public void initialize() {
		setDataSource(datasource);
	}
	@Override
	public void createAccount(Account acc) {
		// TODO Auto-generated method stub
		String createAcc="insert into accounts values(?,?,?)";
		getJdbcTemplate().update(createAcc, new Object[] {acc.getId(),acc.getType(),acc.getMinBalance()});
		
	}

	@Override
	public List<Account> getAllAccounts(){
		String sql = "SELECT * FROM accounts";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Account> result = new ArrayList<Account>();
		for(Map<String, Object> row:rows){
			Account acc = new Account();
			acc.setId((int)row.get("id"));
			acc.setType((String)row.get("type"));
			acc.setMinBalance((int)row.get("minbalance"));
			result.add(acc);
		}
return result;
	}
	public Account getAccountById(int accId) {
		String sql = "SELECT * FROM accounts WHERE id = ?";
		return (Account) getJdbcTemplate().queryForObject(sql, new Object[] { accId }, new RowMapper<Account>() {
			@Override
			public Account mapRow(ResultSet rs, int rwNumber) throws SQLException {
				Account acc = new Account();
				acc.setId(rs.getInt("id"));
				acc.setType(rs.getString("type"));
				acc.setMinBalance(rs.getInt("minbalance"));
				return acc;
			}
		});
	}
	@Override
	public void insertAccounts(List<Account> accounts) {
		// TODO Auto-generated method stub
		
	}
	}
