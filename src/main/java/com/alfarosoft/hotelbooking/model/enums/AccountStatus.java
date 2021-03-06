package com.alfarosoft.hotelbooking.model.enums;

public enum AccountStatus {
    AVAILABLE("Available"),
    ONDEBT ("OnDebt"),
    FORBIDDEN("Forbidden"),
    WITHBONIFICATION("WithBonification");
    private String value;

    AccountStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
