package br.com.lucbecker.apiresource.services;

import br.com.lucbecker.apiresource.domain.User;

public interface UserService {

    User findById(Integer id);
}
