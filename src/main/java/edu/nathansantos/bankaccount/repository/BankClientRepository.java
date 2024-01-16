package edu.nathansantos.bankaccount.repository;

import edu.nathansantos.bankaccount.domain.BankClient;
import org.springframework.data.repository.CrudRepository;

public interface BankClientRepository extends CrudRepository<BankClient, Long> {
    BankClient findByDocumentId(String documentId);
}
