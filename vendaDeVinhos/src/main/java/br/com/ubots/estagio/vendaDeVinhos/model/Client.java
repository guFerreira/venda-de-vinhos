package br.com.ubots.estagio.vendaDeVinhos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private long id;
    private String name;
    private String cpf;
}
