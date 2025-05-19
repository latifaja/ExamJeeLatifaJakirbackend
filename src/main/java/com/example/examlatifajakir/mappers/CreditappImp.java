package com.example.examlatifajakir.mappers;


import com.example.examlatifajakir.dto.*;
import com.example.examlatifajakir.entities.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CreditappImp {
    // Customer
    public CustomerDto fromCustomer(Customer customer) {
        CustomerDto dto = new CustomerDto();
        BeanUtils.copyProperties(customer, dto);
        return dto;
    }

    public Customer fromCustomerDto(CustomerDto dto) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(dto, customer);
        return customer;
    }

    // CreditPersonnel
    public CreditPersonelDto fromCreditPersonnel(CreditPersonnel credit) {
        CreditPersonelDto dto = new CreditPersonelDto();
        BeanUtils.copyProperties(credit, dto);
        return dto;
    }

    public CreditPersonnel fromCreditPersonnelDto(CreditPersonelDto dto) {
        CreditPersonnel credit = new CreditPersonnel();
        BeanUtils.copyProperties(dto, credit);
        return credit;
    }

    // CreditProfessionnel
    public CreditProfDto fromCreditProfessionnel(CreditProfessionnel credit) {
        CreditProfDto dto = new CreditProfDto();
        BeanUtils.copyProperties(credit, dto);
        return dto;
    }

    public CreditProfessionnel fromCreditProfessionnelDto(CreditProfDto dto) {
        CreditProfessionnel credit = new CreditProfessionnel();
        BeanUtils.copyProperties(dto, credit);
        return credit;
    }

    // CreditImmobilier
    public CreditImmobilierDto fromCreditImmobilier(CreditImmobilier credit) {
        CreditImmobilierDto dto = new CreditImmobilierDto();
        BeanUtils.copyProperties(credit, dto);
        return dto;
    }

    public CreditImmobilier fromCreditImmobilierDto(CreditImmobilierDto dto) {
        CreditImmobilier credit = new CreditImmobilier();
        BeanUtils.copyProperties(dto, credit);
        return credit;
    }

    // Remboursement
    public RembDto fromRemboursement(Remboursement remb) {
        RembDto dto = new RembDto();
        BeanUtils.copyProperties(remb, dto);
        return dto;
    }

    public Remboursement fromRemboursementDto(RembDto dto) {
        Remboursement remb = new Remboursement();
        BeanUtils.copyProperties(dto, remb);
        return remb;
    }
}