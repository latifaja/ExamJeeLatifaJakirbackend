package com.example.examlatifajakir.entities;

import com.example.examlatifajakir.enums.TypeBienFinance;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("IMMOBILIER")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreditImmobilier extends Credit {
    @Enumerated(EnumType.STRING)
    @Column(length = 255)
    private TypeBienFinance typeBien;
}

