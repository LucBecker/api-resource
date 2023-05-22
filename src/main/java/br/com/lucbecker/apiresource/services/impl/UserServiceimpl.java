package br.com.lucbecker.apiresource.services.impl;

import br.com.lucbecker.apiresource.domain.User;
import br.com.lucbecker.apiresource.domain.dto.UserDTO;
import br.com.lucbecker.apiresource.repositories.UserRepository;
import br.com.lucbecker.apiresource.services.UserService;
import br.com.lucbecker.apiresource.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;


    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado "));
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        return repository.save(mapper.map(obj, User.class));
    }
}
