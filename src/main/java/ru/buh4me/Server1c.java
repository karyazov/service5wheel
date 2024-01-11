package ru.buh4me;


public class Server1c {
    private String server_name;
    private String platform_path;
    private String cluster_user;
    private String cluster_password;

    public Server1c() {

    }

    public Server1c(String serverName) {

    }

    public String getName() {
        return server_name;
    }

    public void setName(String server_name) {
        this.server_name = server_name;
    }

    public String getPlatform_path() {
        return platform_path;
    }

    public void setPlatform_path(String platform_path) {
        this.platform_path = platform_path;
    }

    public String getCluster_user() {
        return cluster_user;
    }

    public void setCluster_user(String cluster_user) {
        this.cluster_user = cluster_user;
    }

    public String getCluster_password() {
        return cluster_password;
    }

    public void setCluster_password(String cluster_password) {
        this.cluster_password = cluster_password;
    }
}