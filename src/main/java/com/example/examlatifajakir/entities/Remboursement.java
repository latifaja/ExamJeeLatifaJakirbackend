package com.example.examlatifajakir.entities;

import com.example.examlatifajakir.enums.TypeRemb;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Remboursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double montant;
    @Enumerated(EnumType.STRING)
    @Column(length = 255)
    private TypeRemb type;

    @ManyToOne
    private Credit credit;
}
