package org.fasttrackit.curs18.homework.controller;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.curs18.homework.model.Transaction;
import org.fasttrackit.curs18.homework.model.client.TransactionFilter;
import org.fasttrackit.curs18.homework.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("transactions")
public class TransactionController {
    private final TransactionService service;

    @GetMapping
    public List<Transaction> getAll(TransactionFilter filter){
        return service.getAll(filter);
    }
}
