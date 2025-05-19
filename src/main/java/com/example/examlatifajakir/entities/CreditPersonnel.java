package com.example.examlatifajakir.entities;

import jakarta.persistence.*;
import com.example.examlatifajakir.enums.MotifCredit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("PERSONNEL")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreditPersonnel extends Credit {

    @Enumerated(EnumType.STRING)
    @Column(length = 255)
    private MotifCredit motifCredit;
}

