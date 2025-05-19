package com.example.examlatifajakir.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreditProfDto {

    private String motif;

    private String raisonSociale;
}
