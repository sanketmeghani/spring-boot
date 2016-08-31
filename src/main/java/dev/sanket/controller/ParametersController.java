package dev.sanket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.sanket.model.Parameter;

@RestController
public class ParametersController {

    @CrossOrigin
    @RequestMapping(path = "/parameters", method = RequestMethod.GET)
    public List<Parameter> getAll() {

        ArrayList<Parameter> parameters = new ArrayList<>();

        parameters.add(Parameter.create(1, "Parameter One", "Module One", "Value One"));
        parameters.add(Parameter.create(2, "Parameter Two", "Module Two", "Value Two"));
        parameters.add(Parameter.create(3, "Parameter Three", "Module Three", "Value Three"));

        return parameters;
    }
}
