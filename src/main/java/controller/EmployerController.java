package controller;

import model.Employer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/employer")
public class EmployerController {

    @GetMapping("")
    public ModelAndView backHome(){
        ModelAndView mav = new ModelAndView("/home");
        mav.addObject("e", new Employer());
        return mav;
    }
//    @GetMapping("/create")
//    public String showForm(Model model){
//        model.addAttribute("e", new Employer());
//        return "/create";
//    }

    @GetMapping("/create")
    public ModelAndView showForm(){
        ModelAndView mav = new ModelAndView("/create");
        mav.addObject("e", new Employer());
        return mav;
    }
    @PostMapping("/create")
    public  ModelAndView create( Employer employer, @RequestParam(name="add") int dc ){
        ModelAndView mav = new ModelAndView("/infor");
        mav.addObject("e" , employer);
        return mav;
    }


}
