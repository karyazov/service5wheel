package ru.buh4me.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.buh4me.LoadJSONSettings;
import ru.buh4me.base.Base1c;
import ru.buh4me.base.Bases1c;

import java.io.IOException;
import java.util.List;

@Controller
//@RequestMapping(value = "/")
public class StartController {

    @GetMapping("/")
    public String showHello(Model model) {
        List<Base1c> listOfBases;
        try {
            listOfBases = LoadJSONSettings.loadSettingsBase1c();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        model.addAttribute("bases1c", listOfBases);

        return "index";
    }
}
