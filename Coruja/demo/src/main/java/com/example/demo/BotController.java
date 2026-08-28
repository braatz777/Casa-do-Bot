package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BotController {

    private List<Resposta> respostas = new ArrayList<>();

    @GetMapping("/")
    public String inicio(Model model) {
        return "index";
    }

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

        return "redirect:/";
    }

    @GetMapping("/quem-vai")
    public String quemVai(Model model) {

        model.addAttribute("respostas", respostas);

        return "index";
    }
}