package com.example.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class CashCard {

    private long id;
    private double amount;
   


    public CashCard(long id,double amount){
        this.id = id;
        this.amount = amount;
    }
    
}
