package ru.fedko.project.dao;

import org.springframework.stereotype.Repository;
import ru.fedko.project.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    public void createUser(User user) {
        entityManager.persist(user);
    }


    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }


    public void updateUser(User user) {
        entityManager.merge(user);
    }


    public User getUserbyId(int id) {
        return entityManager.find(User.class, id);
    }
}
