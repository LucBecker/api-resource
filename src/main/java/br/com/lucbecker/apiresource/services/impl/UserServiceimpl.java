package br.com.lucbecker.apiresource.services.impl;

import br.com.lucbecker.apiresource.domain.User;
import br.com.lucbecker.apiresource.repositories.UserRepository;
import br.com.lucbecker.apiresource.services.UserService;
import br.com.lucbecker.apiresource.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado "));
    }
}
