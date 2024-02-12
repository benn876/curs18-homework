package org.fasttrackit.curs18.homework.model.client;

import lombok.Builder;
import org.fasttrackit.curs18.homework.model.TransactionType;

@Builder
public record TransactionFilter(
        String product,
        TransactionType type,
        Double minAmount,
        Double maxAmount
) {
}
