package org.example;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //alguma coisa
        LOGGER.info("Conexao iniciada");
    }

    public static void fecharConexao(){
        //alguma coisa
        LOGGER.info("Conexao finalizada");
    }

    public static void insereDados(Pessoa pessoa){
        //TODO inserir pessoa no BancoDeDados
        LOGGER.info("Dados inserido");
    }

    public static void removeDados(Pessoa pessoa){
        //TODO remover pessoa no BancoDeDados
        LOGGER.info("Dados removidos");
    }


}
