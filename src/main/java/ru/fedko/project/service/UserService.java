package ru.fedko.project.service;

import ru.fedko.project.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    User getUserbyId(int id);
}
