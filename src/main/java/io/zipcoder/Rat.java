package io.zipcoder;

public class Rat extends Pet {

    public Rat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "tsk";
    }
}
