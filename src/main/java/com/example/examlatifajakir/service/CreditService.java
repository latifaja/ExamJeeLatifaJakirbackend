package com.example.examlatifajakir.service;

import com.example.examlatifajakir.dto.*;
import com.example.examlatifajakir.entities.Credit;

import java.util.List;

public interface CreditService {
    List<CustomerDto> getAllCustomers();
    CustomerDto saveCustomer(CustomerDto customerDto);

    List<CreditDTO> getAllCredits();
    CreditPersonelDto createCreditPersonnel(CreditPersonelDto creditDto);
    CreditProfDto createCreditProf(CreditProfDto creditDto);

    CreditImmobilierDto createCreditImob(CreditImmobilierDto creditDto);



}
