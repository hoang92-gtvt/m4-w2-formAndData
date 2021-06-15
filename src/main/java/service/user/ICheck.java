package service.user;

import model.Login;
import model.User;

public interface ICheck {
    public User checkLogin(Login login);
}
