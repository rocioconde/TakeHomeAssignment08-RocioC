package com.example.android.takehomeassignment08_rocioc;

/**
 * Created by ccteuser on 3/26/17.
 */

public class FlamencoArtist {

    private String name;
    private int age;
    private boolean performedInNewYork;

    public FlamencoArtist() {
    }

    public FlamencoArtist(String name, int age, boolean performedInNewYork) {
        this.name = name;
        this.age = age;
        this.performedInNewYork = performedInNewYork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPerformedInNewYork() {
        return performedInNewYork;
    }

    public void setPerformedInNewYork(boolean performedInNewYork) {
        this.performedInNewYork = performedInNewYork;
    }
}
