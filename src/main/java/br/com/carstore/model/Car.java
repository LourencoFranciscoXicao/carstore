package br.com.carstore.model;

public class Car {

    private String Id;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car(String id, String name) {
        Id = id;
        this.name = name;
    }

    public String getId() {

        return Id;
    }

    public String getName() {

        return name;
    }

}
