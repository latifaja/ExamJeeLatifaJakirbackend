package com.example.examlatifajakir;

import com.example.examlatifajakir.entities.*;
import com.example.examlatifajakir.enums.MotifCredit;
import com.example.examlatifajakir.enums.StatutCredit;
import com.example.examlatifajakir.enums.TypeBienFinance;
import com.example.examlatifajakir.enums.TypeRemb;
import com.example.examlatifajakir.repository.CreditRepository;
import com.example.examlatifajakir.repository.CustomerRepository;
import com.example.examlatifajakir.repository.RembourcementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ExamLatifaJakirApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamLatifaJakirApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository,
                            CreditRepository creditRepository,
                            RembourcementRepository rembourcementRepository){
        return args -> {
            Stream.of("Hassan","Yassine","Aicha").forEach(name->{
                Customer customer=new Customer();
                customer.setNom(name);
                customer.setEmail(name+"@gmail.com");
                customerRepository.save(customer);
            });
            customerRepository.findAll().forEach(cust->{
                // Crédit Personnel
                CreditPersonnel creditPersonnel = new CreditPersonnel();
                creditPersonnel.setMotifCredit(MotifCredit.ETUDE);
                creditPersonnel.setCustomer(cust);
                creditPersonnel.setMontant(100000);
                creditPersonnel.setDureeRemboursement(24);
                creditPersonnel.setTauxInteret(5.5);
                creditPersonnel.setStatutCredit(StatutCredit.EN_COURS);
                creditPersonnel.setDateDemande(new Date());
                creditPersonnel.setDateAcception(new Date());
                creditRepository.save(creditPersonnel);

                // Crédit Professionnel
                CreditProfessionnel creditProfessionnel = new CreditProfessionnel();
                creditProfessionnel.setMotif("Financement projet");
                creditProfessionnel.setRaisonSociale("SARL " + cust.getNom());
                creditProfessionnel.setCustomer(cust);
                creditProfessionnel.setMontant(500000);
                creditProfessionnel.setDureeRemboursement(48);
                creditProfessionnel.setTauxInteret(6.5);
                creditProfessionnel.setStatutCredit(StatutCredit.ACCEPTE);
                creditProfessionnel.setDateDemande(new Date());
                creditProfessionnel.setDateAcception(new Date());
                creditRepository.save(creditProfessionnel);

                // Crédit Immobilier
                CreditImmobilier creditImmobilier = new CreditImmobilier();
                creditImmobilier.setTypeBien(TypeBienFinance.APPARTEMENT);
                creditImmobilier.setCustomer(cust);
                creditImmobilier.setMontant(300000);
                creditImmobilier.setDureeRemboursement(120);
                creditImmobilier.setTauxInteret(4.2);
                creditImmobilier.setStatutCredit(StatutCredit.REJETE);
                creditImmobilier.setDateDemande(new Date());
                creditRepository.save(creditImmobilier);
            });
            creditRepository.findAll().forEach(cre->{
                for (int i = 1; i <= 3; i++) {
                    Remboursement remb = new Remboursement();
                    remb.setDate(new Date()); // ou ajouter x jours à la date du crédit
                    remb.setMontant(cre.getMontant() / 10); // exemple : 10% du montant
                    remb.setType(TypeRemb.ANTICIPE);
                    remb.setCredit(cre);
                    rembourcementRepository.save(remb);
                }

            });
        };

    }

}
