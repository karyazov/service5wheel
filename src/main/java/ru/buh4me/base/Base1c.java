package ru.buh4me.base;

import ru.buh4me.server.Server1c;
import ru.buh4me.server.ServerSql;

public class Base1c {
    private String baseName;

    private String server1cName;
    private Server1c server1c;
    private String user;
    private String password;
    private String repository_path;
    private String repository_user;
    private String repository_password;
    private String extension_name;
    private String serverSqlName;
    private ServerSql serverSql;
    private String sql_base;
    private String platformPath;
    private String pathToDB;
    private String V83;

    public Base1c() {

    }

    public Base1c(String platform_path, String server_name, String base_name, String user, String password) {
        //Параметры сервера и платформу пока сделаем здесь, потом когда нибудь переделаем
        this.platformPath = platform_path;
        this.server1cName = server_name;

        this.baseName = base_name;
        this.pathToDB = server_name + "\\" + base_name;
        this.user = user;
        this.password = password;
        this.V83 = "";
    }

    public Base1c(String base_name, String file_path) {
        /* Если указано только имя базы тогда нужно прочитать файл с описанием базы */
        System.out.println("Base 1C name =" + base_name + " load from file: " + file_path);

    }

    public Base1c(String base_name) {
        String file_path = "base1c_config.json";
        /* Если указано только имя базы тогда нужно прочитать файл с описанием базы */
        Base1c base1c = new Base1c(base_name, file_path);
    }

    public boolean bindRepository(String repository_path, String repository_user, String repository_password, String extension_name) {
        System.out.println("Binding main configuration: " + baseName + "\n PAth REP:" + repository_path);
        return true;
    }

    public String getV83() {
        return V83;
    }

    public void setV83(String v83) {
        V83 = v83;
    }

    public String getPathToDB() {
        return pathToDB;
    }

    public String getPlatformPath() {
        return platformPath;
    }

    public String getSql_base() {
        return sql_base;
    }

    public void setSql_base(String sql_base) {
        this.sql_base = sql_base;
    }

    public String getServerSqlName() {
        return serverSqlName;
    }

    public void setServerSqlName(String serverSqlName) {
        this.serverSqlName = serverSqlName;
    }

    public String getExtension_name() {
        return extension_name;
    }

    public void setExtension_name(String extension_name) {
        this.extension_name = extension_name;
    }

    public String getRepository_password() {
        return repository_password;
    }

    public void setRepository_password(String repository_password) {
        this.repository_password = repository_password;
    }

    public String getRepository_user() {
        return repository_user;
    }

    public void setRepository_user(String repository_user) {
        this.repository_user = repository_user;
    }

    public String getRepository_path() {
        return repository_path;
    }

    public void setRepository_path(String repository_path) {
        this.repository_path = repository_path;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Server1c getServer_1c() {
        return server1c;
    }

    public void setServer_1c(Server1c server_1c) {
        this.server1c = server_1c;
    }

    public ServerSql getServer_SQL() {
        return serverSql;
    }

    public void setServer_SQL(ServerSql server_SQL) {
        this.serverSql = server_SQL;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getServer1cName() {
        return server1cName;
    }

    public void setServer1cName(String server1cName) {
        this.server1cName = server1cName;
    }


}

