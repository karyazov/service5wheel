package ru.buh4me.controllers;

import org.springframework.web.bind.annotation.*;
import ru.buh4me.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/servers")
public class ServersController {

    @GetMapping
    public HashMap<String, Server1c> showServer1cList() {

        List<Server1c> listOfServers;
        try {
            listOfServers = LoadJSONSettings.loadSettingsServer1c();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Преобразуем список баз в хеш мапу (словарь) чтобы в дальнейшем по ключу получать
        //свойства базы
        HashMap<String, Server1c> dictServers = new HashMap<>();
        for (Server1c server1c : listOfServers) {
            dictServers.put(server1c.getName(), server1c);
        }
        return dictServers;
    }
}
