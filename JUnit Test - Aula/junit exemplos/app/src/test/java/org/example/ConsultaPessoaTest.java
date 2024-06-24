package org.example;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsultaPessoaTest {

    
    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void addDados(){
        BancoDeDados.insereDados(new Pessoa("Andrei", LocalDate.of(1998, 5, 3)));
    }

    @AfterEach
    void removerDados(){
        BancoDeDados.removeDados(new Pessoa("Andrei", LocalDate.of(1998, 5, 3)));
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.fecharConexao();
        System.out.println("rodou finalizouConexao");
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
}
