package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
