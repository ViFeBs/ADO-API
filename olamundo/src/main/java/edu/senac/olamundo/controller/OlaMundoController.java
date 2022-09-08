package edu.senac.olamundo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.senac.olamundo.dto.OlaMundoRequest;
import edu.senac.olamundo.dto.OlaMundoResponse;

@RestController
@RequestMapping(value = "/v1")
public class OlaMundoController {
    
    private static final String MENSAGEM_OLA_MUNDO = "Olá mundo para vc %s. Como vai?";

    @GetMapping(value = "/get/olamundo" , produces = {"application/json"})
    public ResponseEntity<OlaMundoResponse> olaMundo(@Validated @RequestParam(value = "nome", required = false) String nome){
        var olaMundoResponse = new OlaMundoResponse();
        olaMundoResponse.setMensagem(String.format(MENSAGEM_OLA_MUNDO, nome));

        return ResponseEntity.ok(olaMundoResponse);
    }

    @GetMapping(value = "/get/olamundo{nome}" , produces = {"application/json"})
    public ResponseEntity<OlaMundoResponse> olaMundoPath(@PathVariable("nome") String nome){
        var olaMundoResponse = new OlaMundoResponse();
        olaMundoResponse.setMensagem(String.format(MENSAGEM_OLA_MUNDO, nome));

        return ResponseEntity.ok(olaMundoResponse);
    }

    @PostMapping(value = "/post/olamundo", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<OlaMundoResponse> olaMundoPost(@Validated @RequestBody OlaMundoRequest body){
        var olaMundoResponse = new OlaMundoResponse();
        olaMundoResponse.setMensagem(String.format(MENSAGEM_OLA_MUNDO, body.getNome()));

        return ResponseEntity.ok(olaMundoResponse);
    }

    @PutMapping(value = "/put/olamundo", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<OlaMundoResponse> olaMundoPut(@Validated @RequestBody OlaMundoRequest body){
        var olaMundoResponse = new OlaMundoResponse();
        olaMundoResponse.setMensagem(String.format(MENSAGEM_OLA_MUNDO, body.getNome()));

        return ResponseEntity.ok(olaMundoResponse);
    }

    @DeleteMapping(value = "/delete/olamundo", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<OlaMundoResponse> olaMundoDelete(@Validated @RequestBody OlaMundoRequest body){
        var olaMundoResponse = new OlaMundoResponse();
        olaMundoResponse.setMensagem(String.format(MENSAGEM_OLA_MUNDO, body.getNome()));

        return ResponseEntity.ok(olaMundoResponse);
    }
}
