package org.fasttrackit.curs18.homework.service;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.curs18.homework.model.Transaction;
import org.fasttrackit.curs18.homework.model.TransactionType;
import org.fasttrackit.curs18.homework.model.client.TransactionFilter;
import org.fasttrackit.curs18.homework.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository repository;

    public List<Transaction> getAll(TransactionFilter filter) {
        if (filter == null) {
            return repository.findAll();
        }

        if (filter.product() != null) {
            return repository.findAllByProduct(filter.product());
        }

        if (filter.type() != null) {
            return repository.findAllByType(filter.type());
        }
        return repository.findAll();
    }

    public Map<TransactionType, List<Transaction>> getGroupedByType() {
        return repository.findAll().stream().collect(groupingBy(Transaction::getType));
    }

    public Transaction getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction with id:%s was not found".formatted(id)));
    }
}
