package com.atividades.inicial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Bem-vindo!";
    }

    @GetMapping("/welcome-aluno")
    public String welcomeAluno(){
        return "Bem-vindo, Erisvaldo!";
    }

}