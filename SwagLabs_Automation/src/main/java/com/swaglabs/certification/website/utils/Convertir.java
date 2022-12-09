package com.swaglabs.certification.website.utils;

public class Convertir {

    public static String producto(String producto) {
        return producto.replace(" ", "-").toLowerCase();
    }
}
