package service.user;

import model.Login;
import model.User;

import java.util.ArrayList;

public class UserService implements IUserService{
    private static ArrayList<User> users;

    static {
         users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("John");
        u1.setAccountl("john");
        u1.setEmail("john@codegym.vn");
        u1.setPass("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Bill");
        u2.setAccountl("bill");
        u2.setEmail("bill@codegym.vn");
        u2.setPass("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Mike");
        u3.setAccountl("mike");
        u2.setEmail("mike@codegym.vn");
        u3.setPass("123456");
        users.add(u3);

    }

    @Override
    public ArrayList<User> findAll() {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void edit(int id, User user) {

    }

    @Override
    public void delete(int id) {

    }


    @Override
    public User checkLogin(Login login) {
        for (User u:users ) {
            if(u.getAccountl().equals(login.getAccount())&& u.getPass().equals(login.getPass())){
                return u;
            }
        }
        return null;
    }
}
