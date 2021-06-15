package service.user;

import model.User;

import java.util.ArrayList;

public interface IUserService extends ICheck {
    public ArrayList<User> findAll();
    public void add(User user);
    public void edit(int id, User user);
    public void delete(int id);
}
