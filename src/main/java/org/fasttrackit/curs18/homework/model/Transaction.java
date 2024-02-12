package org.fasttrackit.curs18.homework.model;

import lombok.Builder;

@Builder
public record Transaction(
        String id,
        String product,
        TransactionType type,
        Double amount
) {
}
