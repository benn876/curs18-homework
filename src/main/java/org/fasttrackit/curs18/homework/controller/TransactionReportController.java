package org.fasttrackit.curs18.homework.controller;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.curs18.homework.model.Transaction;
import org.fasttrackit.curs18.homework.model.TransactionType;
import org.fasttrackit.curs18.homework.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("transactions/reports")
@RequiredArgsConstructor
public class TransactionReportController {
    private final TransactionService service;

    @GetMapping("type")
    public Map<TransactionType, List<Transaction>> getGroupedByType(){
        return service.getGroupedByType();
    }
}
