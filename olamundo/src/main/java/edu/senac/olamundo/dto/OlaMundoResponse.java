package edu.senac.olamundo.dto;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
public class OlaMundoResponse {
    @JsonProperty("mensagem")
    private String mensagem = "Desconhecido";

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }   
}
