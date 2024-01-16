package edu.nathansantos.bankaccount.service;

import edu.nathansantos.bankaccount.domain.BankClient;
import edu.nathansantos.bankaccount.repository.BankClientRepository;
import org.springframework.stereotype.Service;

@Service
public class BankClientService {
    private BankClientRepository bankClientRepository;

    public BankClientService(BankClientRepository bankClientRepository) {
        this.bankClientRepository = bankClientRepository;
    }

    public BankClient createNewClient(String firstName, String lastName, String documentId){
        BankClient client = bankClientRepository.findByDocumentId(documentId);
        if(client != null) {
            return client;
        }
        return bankClientRepository.save(new BankClient(firstName, lastName, documentId));
    }
}
