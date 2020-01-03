package com.sgl.smartpra.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialMonthRepository
		extends JpaRepository<com.sgl.smartpra.app.model.FinancialMonthEntity, Integer> {

	
}
