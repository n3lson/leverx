package ru.leverx.entity;

import java.util.ArrayList;

public class Aviary extends ArrayList<Dog> {
    private boolean isDirty;

    public Aviary(int length) {
        super(length);
    }

    boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }
}
