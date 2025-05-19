package com.example.examlatifajakir.service;

import com.example.examlatifajakir.dto.*;
import com.example.examlatifajakir.entities.Customer;
import com.example.examlatifajakir.mappers.CreditappImp;
import com.example.examlatifajakir.repository.CreditRepository;
import com.example.examlatifajakir.repository.CustomerRepository;
import com.example.examlatifajakir.repository.RembourcementRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@Slf4j
public class CreditServiceImpl implements CreditService {


    CreditappImp dtoMapper;
    CustomerRepository customerRepository;
    CreditRepository creditRepository;
    RembourcementRepository rembresourcementRepository;
    @Override
    public List<CustomerDto> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        log.info("Saving new Customer");
        Customer customer=dtoMapper.fromCustomerDto(customerDto);
        Customer savedCustomer = customerRepository.save(customer);
        return dtoMapper.fromCustomer(savedCustomer);
    }

    @Override
    public List<CreditDTO> getAllCredits() {
        return List.of();
    }

    @Override
    public CreditPersonelDto createCreditPersonnel(CreditPersonelDto creditDto) {
        return null;
    }

    @Override
    public CreditProfDto createCreditProf(CreditProfDto creditDto) {
        return null;
    }

    @Override
    public CreditImmobilierDto createCreditImob(CreditImmobilierDto creditDto) {
        return null;
    }
}
