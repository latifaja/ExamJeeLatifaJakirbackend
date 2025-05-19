package com.example.examlatifajakir.service;

import com.example.examlatifajakir.dto.CreditDTO;
import com.example.examlatifajakir.entities.Credit;

import java.util.List;

public interface CreditService {

    List<CreditDTO> getAllCredits();
    CreditDTO createCredit(CreditDTO creditDto);
}
