package ru.buh4me;

public class Task {
    private String actionName;
    private String actionOperation;
    private boolean actionUse;

    public Task() {
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getActionOperation() {
        return actionOperation;
    }

    public void setActionOperation(String actionOperation) {
        this.actionOperation = actionOperation;
    }

    public boolean isActionUse() {
        return actionUse;
    }

    public void setActionUse(boolean actionUse) {
        this.actionUse = actionUse;
    }
}
