package edu.senac.olamundo.dto;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
public class OlaMundoRequest {
    @JsonProperty("nome")
    private String nome = "Desconhecido";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
