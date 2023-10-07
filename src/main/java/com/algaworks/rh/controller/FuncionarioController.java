package com.algaworks.rh.controller;

import com.algaworks.rh.model.Funcionario;
import com.algaworks.rh.repository.FuncionarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    public List<Funcionario> listar() {
        return funcionarioRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Funcionario> cadastrar(@RequestBody List<Funcionario> funcionarios) {
        return funcionarioRepository.saveAll(funcionarios);
    }
}
