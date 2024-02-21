package org.fasttrackit.curs18.homework;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.curs18.homework.model.Transaction;
import org.fasttrackit.curs18.homework.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.fasttrackit.curs18.homework.model.TransactionType.BUY;
import static org.fasttrackit.curs18.homework.model.TransactionType.SELL;

@Component
@RequiredArgsConstructor
@Slf4j
public class CommandRunner implements CommandLineRunner {
    private final TransactionRepository repository;

    @Override
    public void run(String... args) {
        log.info("Runner is populating with data");
        repository.saveAll(List.of(
                Transaction.builder()
                        .product("TV")
                        .type(BUY)
                        .amount(3000D)
                        .build(),
                Transaction.builder()
                        .product("laptop")
                        .type(SELL)
                        .amount(8000D)
                        .build(),
                Transaction.builder()
                        .product("Quest")
                        .type(BUY)
                        .amount(1500D)
                        .build()
        ));
    }
}
