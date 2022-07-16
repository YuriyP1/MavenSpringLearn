package ua.pevzner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.pevzner.dao.PersonDAO;

@Controller
@RequestMapping("/people")
public class PeopleController {

    PersonDAO personDAO;

    @Autowired
    public PeopleController (PersonDAO personDAO){
        this.personDAO = personDAO;
    }

    @GetMapping("/show")
    public String showPerson(Model model){

        model.addAttribute("people", personDAO.getPeopleList());
        return "people/people";
    }

    @GetMapping("/{id}")
    public String getPerson(@PathVariable("id") int id, Model model){

        model.addAttribute("person", personDAO.getPerson(id));
        return "people/person";
    }
}
