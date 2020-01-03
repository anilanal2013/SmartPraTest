package com.sgl.smartpra.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgl.smartpra.app.model.FinancialMonthEntity;
import com.sgl.smartpra.app.service.FinancialMonthService;

@Service
public class FinancialMonthServiceImpl implements FinancialMonthService {

	@Autowired
	private com.sgl.smartpra.app.dao.FinancialMonthRepository financialMonthRepository;

	
	@Override
	public List<FinancialMonthEntity> getListOfFinancialMonthCalendar() {
		return financialMonthRepository.findAll();
	}

}
