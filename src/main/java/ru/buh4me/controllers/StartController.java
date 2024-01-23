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
@RequestMapping(value = "/")
public class StartController {

    @GetMapping
    public String showHello() {
        return "Hello!";
    }
}
