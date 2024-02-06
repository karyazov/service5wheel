package ru.buh4me.task;

import java.util.List;

public class Tasks {
    private String baseName;
    private boolean use_base;
    private List<Task> tasks;

    public Tasks() {
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public boolean isUse_base() {
        return use_base;
    }

    public void setUse_base(boolean use_base) {
        this.use_base = use_base;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
