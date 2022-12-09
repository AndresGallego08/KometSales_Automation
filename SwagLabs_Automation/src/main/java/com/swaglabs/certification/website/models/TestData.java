package com.swaglabs.certification.website.models;

public class TestData {


    private String userName;

    public TestData(String userName, String password, String producto1, String producto2,
                    String firstName, String lastName, String codigoPostal) {
        this.userName = userName;
        this.password = password;
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.firstName = firstName;
        this.lastName = lastName;
        this.codigoPostal = codigoPostal;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getProducto1() {
        return producto1;
    }

    public String getProducto2() {
        return producto2;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    private String password;
    private String producto1;
    private String producto2;
    private String firstName;
    private String lastName;
    private String codigoPostal;


}
