package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BotController {

    private List<Resposta> respostas = new ArrayList<>();

    @PostMapping("/enviar")
    public String receberDados(
            @RequestParam String nome,
            @RequestParam String vai,
            @RequestParam String levar) {

        Resposta resposta = new Resposta(nome, vai, levar);

        respostas.add(resposta);

        System.out.println("Resposta adicionada!");
        System.out.println("Nome: " + nome);
        System.out.println("Vai: " + vai);
        System.out.println("Levar: " + levar);

        return "Dados recebidos!";
    }

    @GetMapping("/respostas")
    public List<Resposta> mostrarRespostas() {
        return respostas;
    }
}