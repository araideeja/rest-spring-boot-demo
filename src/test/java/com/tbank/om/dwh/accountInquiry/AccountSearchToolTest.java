package com.tbank.om.dwh.accountInquiry;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountSearchToolTest {

	@Test
	public void test() {
		AccountSearchTool tool = new AccountSearchTool();
		String accountNo = tool.searchByFacilityNo("XXX");
		assertEquals("12345", accountNo);
	}

}
