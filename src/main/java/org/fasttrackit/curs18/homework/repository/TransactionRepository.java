package org.fasttrackit.curs18.homework.repository;

import org.fasttrackit.curs18.homework.model.Transaction;
import org.fasttrackit.curs18.homework.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByProduct(String product);

    List<Transaction> findAllByType(TransactionType type);
}
