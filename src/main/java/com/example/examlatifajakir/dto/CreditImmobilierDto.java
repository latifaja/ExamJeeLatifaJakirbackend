package com.example.examlatifajakir.dto;

import com.example.examlatifajakir.enums.TypeBienFinance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreditImmobilierDto {
    private TypeBienFinance typeBien;
}
