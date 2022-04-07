package br.com.ubots.estagio.vendaDeVinhos.controller;

import br.com.ubots.estagio.vendaDeVinhos.model.Client;
import br.com.ubots.estagio.vendaDeVinhos.service.ClientService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class ClientControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private ClientService clientService;

    @Test
    public void testReturnClientWithPurchaseBiggestInTheLastYear() throws Exception {
        Client client = new Client();
        client.setId(1);
        client.setName("Gustavo");
        client.setCpf("000.000.000-01");

        Mockito.when(clientService.getClientWithPurchaseBiggestInTheLastYear())
                .thenReturn(client);

        mvc.perform(get("/client/purchase"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string(containsString("Gustavo")));
    }
}
