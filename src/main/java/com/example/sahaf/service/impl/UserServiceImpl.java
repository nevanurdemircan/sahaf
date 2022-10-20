package com.example.sahaf.service.impl;

import com.example.sahaf.entities.User;
import com.example.sahaf.repository.UserRepository;
import com.example.sahaf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user, int id) {
        User willBeUpdated = userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        willBeUpdated.setName(user.getName());
        willBeUpdated.setSurname(user.getName());
        willBeUpdated.setPhoneNumber(user.getPhoneNumber());
        willBeUpdated.setEmail(user.getEmail());
        willBeUpdated.setPassword(user.getPassword());

        return userRepository.save(user);
    }

    @Override
    public String delete(int id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return "başarılı";
        } else {
            return "id yanlış";
        }
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
