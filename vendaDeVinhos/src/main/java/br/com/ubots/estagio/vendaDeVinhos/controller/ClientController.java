package br.com.ubots.estagio.vendaDeVinhos.controller;

import br.com.ubots.estagio.vendaDeVinhos.model.Client;
import br.com.ubots.estagio.vendaDeVinhos.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client/purchase")
    public ResponseEntity<Client> getClientWithPurchaseBiggestInTheLastYear(){
        Client client = this.clientService.getClientWithPurchaseBiggestInTheLastYear();
        return ResponseEntity.ok(client);
    }
}
