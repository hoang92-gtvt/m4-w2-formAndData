package controller;

import model.Login;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import service.user.IUserService;
import service.user.UserService;

@Controller
public class UserController {
    IUserService userService = new UserService();

    @GetMapping("/login")
    public ModelAndView showForm(){
        ModelAndView mav = new ModelAndView("/login");
        mav.addObject("login", new Login());
        return mav;
    }

    @PostMapping("/login")
    public ModelAndView login(Login login){
        ModelAndView mav = new ModelAndView("/detail");
        User user = userService.checkLogin(login);
        mav.addObject("user", user);
        return mav;
    }
}
