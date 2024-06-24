package org.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PessoaTest {
    
    @Test
    void verificarRotornoIdadde(){
        Pessoa pessoa = new Pessoa("Andrei", LocalDate.of(1998, 5, 3));

        Assertions.assertEquals(26, pessoa.getIdade());
    }

    @Test
    void verificaMaiorIdade(){
        Pessoa pessoa = new Pessoa("Andrei", LocalDate.of(1998, 5, 3));
        Assertions.assertTrue(pessoa.isMaiorIdade());
    }
}
