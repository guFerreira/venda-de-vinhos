package br.com.ubots.estagio.vendaDeVinhos.repository;

import br.com.ubots.estagio.vendaDeVinhos.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("")
    public Client findByBiggestPurchaseInLastYear();
}
