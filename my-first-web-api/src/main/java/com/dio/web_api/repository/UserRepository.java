package com.dio.web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dio.web_api.handler.BusinessException;
import com.dio.web_api.model.User;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getUsername() == null)
            throw new BusinessException("O campo username é obrigatorio");

        if (user.getId() == null) {
            System.out.println("SAVE - Recebemos o usuario na camada repositorio");
        } else {
            System.out.println("UPDATE - Recebemos o usuario na camada repositorio");
        }

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuarios do sistema");
        List<User> user = new ArrayList<>();
        user.add(new User("Andrei", "123456"));
        user.add(new User("Tanaeli", "123456"));
        return user;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario", id));
        return new User("Andrei", "123456");
    }

    public User findByUserName(String username) {
        System.out.println(String.format("FIND/username - Recebendo o nome: %s para localizar um usuario", username));
        return new User("Tanaeli", "123456");
    }

}
