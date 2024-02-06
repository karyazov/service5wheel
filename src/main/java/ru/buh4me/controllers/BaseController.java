package ru.buh4me.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.buh4me.base.Base1c;
import ru.buh4me.base.Bases1c;
import ru.buh4me.LoadJSONSettings;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@Controller
//@RequestMapping(value = "/bases1c")
public class BaseController {

    @GetMapping("/bases1c")
    public String showBaseList(Model model) {

        List<Base1c> listOfBases;
        try {
            listOfBases = LoadJSONSettings.loadSettingsBase1c();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Преобразуем список баз в хеш мапу (словарь) чтобы в дальнейшем по ключу получать
        //свойства базы
        //HashMap<String, Base1c> dictBases = new HashMap<>();
        Bases1c allBases1C = new Bases1c();
        allBases1C.setDictBases1c(listOfBases);

        model.addAttribute("bases1c", listOfBases);
        //model.addAttribute("base1c", new Base1c());


        return "bases1c";
    }
    @GetMapping("/base1c")
    public String showBase1C(@RequestParam(value = "baseName", required = true) String baseName, Model model) {

        Base1c currentBase1C  = new Base1c(baseName);

        model.addAttribute("base1c", currentBase1C);


        return "base1c";
    }
}
