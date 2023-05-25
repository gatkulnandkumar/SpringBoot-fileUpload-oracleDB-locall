package com.app.service;

import java.util.List;

import com.app.model.Invoice;

public interface IExcelDataService {

	List<Invoice> getExcelDataAsList();
	
	int saveExcelData(List<Invoice> invoices);
}