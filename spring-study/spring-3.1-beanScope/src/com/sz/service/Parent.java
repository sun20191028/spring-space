package com.sz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.sz.dao.BankDao;

@Component
public class Parent implements ParentInterface{
	
//	@Autowired
//	@Qualifier("bankDaoImpl")
	private BankDao bankDao;
	
	@Override
	public void service(){
		System.out.println("율율율율율율");
		String bank = bankDao.getBank();
		String addr = getAddress();
		System.out.println(bank + ": addr = " + addr + ",쫄엥율율율율율");
	}
	
	public String getAddress(){
		return "�炙�";
	}
	
	public BankDao getBankDao() {
		return bankDao;
	}

	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}
}
