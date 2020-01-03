package com.sgl.smartpra.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgl.smartpra.app.model.FinancialMonthEntity;
import com.sgl.smartpra.app.service.FinancialMonthService;

@RestController
public class FinancialMonthController {

	@Autowired
	private FinancialMonthService financialMonthService;

	@GetMapping("/financial-month")
	public List<FinancialMonthEntity> getListOfFinancialMonthCalendar() {
		return financialMonthService.getListOfFinancialMonthCalendar();
	}

}
