package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.CashCard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController

public class CashCardController {
    
   
    // @GetMapping("/cashcards/{requestedId}")
    // private CashCard findById(@PathVariable Long requestedID){
    //     return null;
        
    // }

    @GetMapping("/cashcards/{requestedId}")
    private ResponseEntity<CashCard> findById(@PathVariable Long requestedID){
        CashCard cashCard = null;
        return ResponseEntity.ok(cashCard);

    }


   
}
