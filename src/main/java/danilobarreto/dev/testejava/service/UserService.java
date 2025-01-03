package danilobarreto.dev.testejava.service;

import danilobarreto.dev.testejava.model.User;
import danilobarreto.dev.testejava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() { return userRepository.findAll(); }

    public User createUser(User user) { return userRepository.save(user); }

    public User updateUser(Long id, User user) {
        User userToUpdate = userRepository.findById(id).orElse(null);
        if (userToUpdate == null) {
            return null;
        }
        if (!user.getEmail().equals(userToUpdate.getEmail()) && userRepository.findByEmail(user.getEmail()) != null) {
            return null;
        }
        userToUpdate.setName(user.getName());
        userToUpdate.setEmail(user.getEmail());
        return userRepository.save(userToUpdate);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
