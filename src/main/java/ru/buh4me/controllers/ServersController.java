package ru.buh4me.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.buh4me.*;
import ru.buh4me.server.Server1c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
//@RequestMapping(value = "/servers")
public class ServersController {

    @GetMapping("/servers1c")
    public String showServer1cList(Model model) {

        List<Server1c> listOfServers;
        try {
            listOfServers = LoadJSONSettings.loadSettingsServer1c();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        model.addAttribute("servers1c", listOfServers);

        return "servers1c";
    }
}
