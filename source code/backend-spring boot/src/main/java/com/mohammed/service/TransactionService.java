package com.mohammed.service;

import com.mohammed.model.Order;
import com.mohammed.model.Seller;
import com.mohammed.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
