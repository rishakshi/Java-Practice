package org.example.ci;

public class Certi {
    private String name;

    public Certi() {
        super();
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Certi(String name) {
        this.name = name;
    }
}
