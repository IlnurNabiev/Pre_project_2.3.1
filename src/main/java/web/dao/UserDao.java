package web.dao;

import web.models.User;

import java.util.ArrayList;
import java.util.List;

public interface UserDao {
    List<User> index();
    User show(int id);
    void save(User user);
    User update(User userUpdate);
    void delete(int id);
}
