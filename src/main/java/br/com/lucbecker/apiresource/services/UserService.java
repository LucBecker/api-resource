package br.com.lucbecker.apiresource.services;

import br.com.lucbecker.apiresource.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
