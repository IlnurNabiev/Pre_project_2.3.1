package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    User update(User userUpdate);
    void delete(int id);
}
