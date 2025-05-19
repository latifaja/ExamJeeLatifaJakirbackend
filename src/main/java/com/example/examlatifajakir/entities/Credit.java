package com.example.examlatifajakir.entities;

import com.example.examlatifajakir.enums.StatutCredit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@NoArgsConstructor @AllArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type")
public abstract class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateDemande;
    @Enumerated(EnumType.STRING)
    @Column(length = 255)
    private StatutCredit statutCredit;
    private Date dateAcception;
    private double montant;
    private int dureeRemboursement;
    private double tauxInteret;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "credit")
    private List<Remboursement> remboursements;
}

