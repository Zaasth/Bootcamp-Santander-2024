package com.estudo.testespring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {
    @GetMapping
    public String helloWorld(){
        return "<h1>Hello, World!</h1>";
    }
}
