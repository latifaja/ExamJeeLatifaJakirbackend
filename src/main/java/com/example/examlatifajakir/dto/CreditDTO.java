package com.example.examlatifajakir.dto;

import com.example.examlatifajakir.entities.Customer;
import com.example.examlatifajakir.entities.Remboursement;
import com.example.examlatifajakir.enums.StatutCredit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data @NoArgsConstructor @AllArgsConstructor
public class CreditDTO {

    private Long id;

    private Date dateDemande;

    private StatutCredit statutCredit;
    private Date dateAcception;
    private double montant;
    private int dureeRemboursement;
    private double tauxInteret;


    private CustomerDto customerDto;

    private List<RembDto> remboursements;
}
