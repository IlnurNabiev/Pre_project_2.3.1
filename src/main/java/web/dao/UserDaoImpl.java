package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Person;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<User> index() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
    @Transactional
    public User show(int id) {
        return entityManager.find(User.class, id);
    }
    @Transactional
    public void save(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }
    @Transactional
    public User update(User userUpdate) {
       return entityManager.merge(userUpdate);
    }
    @Transactional
    public void delete(int id) {
        entityManager.remove(show(id));
        entityManager.flush();
    }

}
