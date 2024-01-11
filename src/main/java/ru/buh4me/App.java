package ru.buh4me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        String base1cConfigFile = "base1c_config.json";

        //**************************
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
        //**************************
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
        //**************************
        System.out.println();
        List<Base1c> listOfBases;
        try {
            listOfBases = LoadJSONSettings.loadSettingsBase1c(base1cConfigFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Преобразуем список баз в хеш мапу (словарь) чтобы в дальнейшем по ключу получать
        //свойства базы
        HashMap<String, Base1c> dictBases = new HashMap<>();
        for (Base1c b : listOfBases) {
            dictBases.put(b.getBaseName(), b);
            b.setServer_1c(dictServers.get(b.getServer1cName()));
            b.setServer_SQL(dictServersSQL.get(b.getServerSqlName()));
        }
        //*******************************************************************
        //          Есть словарь баз dictBases
        //*******************************************************************

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
