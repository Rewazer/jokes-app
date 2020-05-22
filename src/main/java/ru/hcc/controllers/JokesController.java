package ru.hcc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.hcc.services.JokesService;

@Controller
public class JokesController {
    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("jokes", jokesService.getJoke());

        return "chucknorris";
    }
}
