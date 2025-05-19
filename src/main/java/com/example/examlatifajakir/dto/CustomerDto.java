package com.example.examlatifajakir.dto;

import com.example.examlatifajakir.entities.Credit;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDto {
    private Long id;

    private String nom;
    private String email;

    private List<CreditDTO> credits;
}
