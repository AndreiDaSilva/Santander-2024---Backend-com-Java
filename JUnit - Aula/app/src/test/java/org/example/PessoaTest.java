package org.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    Pessoa pessoa = new Pessoa("Andrei", LocalDate.of(1998, 5, 3));
    
    @Test
    void validarCalcularIdade(){
        Assertions.assertEquals(26, pessoa.getIdade());
    }

    @Test
    void validarTipoNome(){
        String esperado = "Andrei";
        Assertions.assertEquals(esperado, pessoa.getNome());    
    }
}
