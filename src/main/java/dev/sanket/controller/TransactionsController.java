package dev.sanket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sanket.model.Transaction;

@RestController
public class TransactionsController {

	@CrossOrigin
	@RequestMapping("/transactions")
	public List<Transaction> getAll() {

		ArrayList<Transaction> transactions = new ArrayList<Transaction>();

		Transaction transaction = new Transaction();
		transaction.setId(1);
		transaction.setStatus("Active");

		transactions.add(transaction);

		return transactions;
	}
}
