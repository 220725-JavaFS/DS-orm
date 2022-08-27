package com.revature.services;

import com.revature.models.Account;

import com.revature.repos.AccountRepo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AccountServiceTest {

	private AccountRepo mockRepo = Mockito.mock(AccountRepo.class);
	private AccountService accountService = new AccountService(mockRepo);
	private Account account;
	
	
	@BeforeEach
	public void setUp() {
		account = new Account(false, false, true, "testnewaccount@revature.com", "testFirst", 
				"testLast", "password");
	}
	
	@Test
	public void testInsertAccount(String json) {
		accountService.insertAccount(json);
	}
	
	@Test
	public void testFindByUser_email() {
		Mockito.when(mockRepo.getAccountByUser_email("testnewaccount@revature.com"))
		.thenReturn(new Account());
//		Account a = accountService.getAccountByUser_email("testnewaccount@revature.com");
//		assertEquals(account, a);
	}
	
	@Test
	public void testAccountsAssemble() {
		accountService.getAllAccounts();
	}
	
	@Test
	public void testUpdateAccount() {
		accountService.updateAccount(account);
	}
	
	@Test
	public void testDeleteAccount() {
		accountService.deleteAccount(account);
	}
	
	//private Account testAccount = new Account(true, false, false, "dustin@revature.com", "Dustin", 
		//"Shipley", "password");
		
		//private Account insertAccount = new Account (false, false, true, "newaccount@revature.com", 
				//"New", "Account", "password");

//	@Test
//	public void testAccountsAssemble() {
//		Mockito.when(mockRepo.getAllAccounts())
//		.thenReturn((List<Account>) new Account());
//		List<Account> a = accountService.accountsAssemble();
//		assertEquals(testAccount, a);
//	}
}
