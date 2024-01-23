package ru.buh4me.controllers;

import org.springframework.web.bind.annotation.*;
import ru.buh4me.Base1c;
import ru.buh4me.BaseResponse;
import ru.buh4me.Bases1c;
import ru.buh4me.LoadJSONSettings;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/bases")
public class BaseController {

    @GetMapping
    public HashMap<String, Base1c> showBaseList() {

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

        return allBases1C.getDictBases1c();
    }
}
