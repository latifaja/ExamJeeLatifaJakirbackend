package com.example.examlatifajakir.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("PROFESSIONNEL")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreditProfessionnel extends Credit {
    @Column(length = 255) // <- ajoute cette annotation pour éviter le truncation
    private String motif;

    @Column(length = 255)
    private String raisonSociale;
}

