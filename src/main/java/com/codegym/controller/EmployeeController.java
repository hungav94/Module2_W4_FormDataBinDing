package com.codegym.controller;

import com.codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @GetMapping("")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("employee/create", "employee", new Employee());
        return modelAndView;
    }

    @PostMapping("/addEmployee")
    public ModelAndView submit(@ModelAttribute("employee") Employee employee, BindingResult result){
        ModelAndView modelAndView = new ModelAndView("employee/info");
        modelAndView.addObject("name", employee.getName());
        modelAndView.addObject("contactNumber", employee.getContactNumber());
        modelAndView.addObject("id", employee.getId());
        return modelAndView;
    }
}
