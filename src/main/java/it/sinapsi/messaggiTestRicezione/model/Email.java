package it.sinapsi.messaggiTestRicezione.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.UUID;

@Entity(name="email")
public class Email implements Serializable {
    @jakarta.persistence.Id
    private UUID id;
    @Column(nullable = false)
    private String mittente;
    @Column(nullable = false)
    private String body;

    public Email() {
    }

    public Email(UUID id, String mittente, String body) {
        this.id = id;
        this.mittente = mittente;
        this.body = body;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String to) {
        this.mittente = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("id=%s, mittente=%s, body=%s", getId(), getMittente(), getBody());
    }
}
