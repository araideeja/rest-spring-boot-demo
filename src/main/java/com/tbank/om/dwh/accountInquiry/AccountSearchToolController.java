package com.tbank.om.dwh.accountInquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountSearchToolController {
	@Autowired
	AccountSearchTool tool;

	@GetMapping("/searchByFacility/{facilityNo}")
	public String searchByFacility(@PathVariable String facilityNo) {
		return tool.searchByFacilityNo(facilityNo);
	}
}
