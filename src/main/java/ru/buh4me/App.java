package ru.buh4me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.buh4me.base.Bases1c;
import ru.buh4me.server.ServerSql;
import ru.buh4me.task.Tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        //****** SQL SERVER
        List<ServerSql> listOfSqlServers;
        try {
            listOfSqlServers = LoadJSONSettings.loadSettingsServerSQL();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Преобразуем список баз в хеш мапу (словарь) чтобы в дальнейшем по ключу получать
        //свойства базы
        HashMap<String, ServerSql> dictServersSQL = new HashMap<>();
        for (ServerSql serverSql : listOfSqlServers) {
            dictServersSQL.put(serverSql.getName(), serverSql);
        }

        List<Tasks> listOfTasks;
        try {
            listOfTasks = LoadJSONSettings.loadTasks();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("BASE Tasks");
        for (Tasks baseTask : listOfTasks) {
            System.out.println("Tasks base=" + baseTask.getBaseName());
            if (baseTask.isUse_base()) {
                System.out.println("Берем");
            } else {
                System.out.println("Не берем");
            }

        }
    }
}
