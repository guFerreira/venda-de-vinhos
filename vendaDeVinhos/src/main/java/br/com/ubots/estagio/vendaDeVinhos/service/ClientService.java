package br.com.ubots.estagio.vendaDeVinhos.service;

import br.com.ubots.estagio.vendaDeVinhos.model.Client;
import br.com.ubots.estagio.vendaDeVinhos.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client getClientWithPurchaseBiggestInTheLastYear() {
        return this.clientRepository.findByBiggestPurchaseInLastYear();
    }
}
