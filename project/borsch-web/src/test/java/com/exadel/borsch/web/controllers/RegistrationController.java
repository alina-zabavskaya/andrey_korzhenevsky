package com.exadel.borsch.web.controllers;


import com.exadel.borsch.entity.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;


@Controller
@RequestMapping("/registrationform")
public class RegistrationController{

    @Autowired
    private RegistrationValidation registrationValidation;

    public void setRegistrationValidation(RegistrationValidation registrationValidation){
        this.registrationValidation = registrationValidation;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showRegistration(Map model) {

        Registration registration = new Registration();
        model.put("registration",registration);
        return "registrationform";
    }

    @RequestMapping(method = RequestMethod.POST)
    private String processRegistration(@Valid Registration registration,
                                       BindingResult result) {

    //    registrationValidation.validate(registration, result);
        if (result.hasErrors()) {
            return "registrationform";
        }
        return "registrationsuccess";
    }

}
