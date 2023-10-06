package com.algaworks.rh.controller;

import com.algaworks.rh.model.Funcionarios;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @GetMapping
    public String testar() {
        return "Isso é um teste!";
    }

    @PostMapping
    public Funcionarios cadastrar(@RequestBody Funcionarios funcionarios) {
        System.out.println(funcionarios);
        return funcionarios;
    }
}
