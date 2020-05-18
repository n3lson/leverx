package ru.leverx.entity;

public enum Job {
    POLICE, EMERGENCY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
