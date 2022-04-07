package br.com.ubots.estagio.vendaDeVinhos.service;

import br.com.ubots.estagio.vendaDeVinhos.model.Client;
import br.com.ubots.estagio.vendaDeVinhos.repository.ClientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @InjectMocks
    ClientService clientService;

    @Mock
    ClientRepository clientRepository;

    @Test
    public void testClientWithBiggestPurchaseInLastYear(){

        Client client = Client.builder()
                .id(1)
                .cpf("000.000.000-01")
                .name("Gustavo")
                .build();

        Mockito.when(clientRepository.findByBiggestPurchaseInLastYear())
                .thenReturn(client);

        Client biggestBuyer = this.clientService.getClientWithPurchaseBiggestInTheLastYear();
        Assertions.assertEquals("000.000.000-01", biggestBuyer.getCpf());
    }

}
