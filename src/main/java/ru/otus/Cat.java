package ru.otus;

public class Cat {
    private String name;
    private String surName;

    public Cat() {
        name = "Барсик";
        surName = "Котов";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
