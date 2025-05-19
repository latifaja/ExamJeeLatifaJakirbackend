package com.example.examlatifajakir.dto;

import com.example.examlatifajakir.entities.Credit;
import com.example.examlatifajakir.enums.TypeRemb;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class RembDto {
    private Long id;
    private Date date;
    private double montant;

    private TypeRemb type;


    private Credit credit;

}