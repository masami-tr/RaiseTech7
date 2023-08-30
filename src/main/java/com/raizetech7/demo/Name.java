package com.raizetech7.demo;

public class Name {

    private int id;

    private String givenName;
    private String firstName;




    public Name(int id,String givenName, String firstName) {
        this.id = id;
        this.givenName = givenName;
        this.firstName = firstName;

    }

    public int getId() {
        return id;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFirstName() {
        return firstName;
    }
}
