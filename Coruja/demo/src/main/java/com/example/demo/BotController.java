package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotController {

    @PostMapping("/enviar")
    public String receberDados(
            @RequestParam String nome,
            @RequestParam String vai,
            @RequestParam String levar) {

        System.out.println(nome);
        System.out.println(vai);
        System.out.println(levar);

        return "Dados recebidos!";
    }
}