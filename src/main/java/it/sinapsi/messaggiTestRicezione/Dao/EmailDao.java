package it.sinapsi.messaggiTestRicezione.Dao;

import it.sinapsi.messaggiTestRicezione.business.EmailPostgresRepository;
import it.sinapsi.messaggiTestRicezione.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailDao {
    @Autowired
    private EmailPostgresRepository repository;

    public void createPostgres(Email email){
        try{
            this.repository.save(email);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
