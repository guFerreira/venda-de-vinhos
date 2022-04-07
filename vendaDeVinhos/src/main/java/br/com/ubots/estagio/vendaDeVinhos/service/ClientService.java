package br.com.ubots.estagio.vendaDeVinhos.service;

import br.com.ubots.estagio.vendaDeVinhos.model.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    public Client getClientWithPurchaseBiggestInTheLastYear() {
        return new Client();
    }
}
