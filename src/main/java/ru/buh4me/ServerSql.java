package ru.buh4me;

public class ServerSql {
    private String name;
    private String sa_user;
    private String sa_user_password;
    private String backup_path;

    public ServerSql() {

    }
    public ServerSql(String serverSqlName) {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSa_user() {
        return sa_user;
    }

    public void setSa_user(String sa_user) {
        this.sa_user = sa_user;
    }

    public String getSa_user_password() {
        return sa_user_password;
    }

    public void setSa_user_password(String sa_user_password) {
        this.sa_user_password = sa_user_password;
    }

    public String getBackup_path() {
        return backup_path;
    }

    public void setBackup_path(String backup_path) {
        this.backup_path = backup_path;
    }
}
