package com.tbank.om.dwh.accountInquiry;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class AccountSearchToolControllerTest {

	@Autowired
	private TestRestTemplate rest; 
	
	@MockBean
	AccountSearchTool tool;
	
	@Test
	public void test() {
		given(tool.searchByFacilityNo("1234")).willReturn("123456");
		
		String account 
		= rest.getForObject("/searchByFacility/1234", String.class);
		assertEquals("123456", account);
	}

}
