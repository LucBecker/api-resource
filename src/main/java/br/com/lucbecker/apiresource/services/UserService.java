package br.com.lucbecker.apiresource.services;

import br.com.lucbecker.apiresource.domain.User;
import br.com.lucbecker.apiresource.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
