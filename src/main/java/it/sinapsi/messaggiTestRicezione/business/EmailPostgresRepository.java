package it.sinapsi.messaggiTestRicezione.business;

import it.sinapsi.messaggiTestRicezione.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmailPostgresRepository extends JpaRepository<Email, UUID> {
    List<Email> findEmailByMittente(String mittente);
}
