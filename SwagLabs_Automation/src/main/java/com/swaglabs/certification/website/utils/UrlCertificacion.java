package com.swaglabs.certification.website.utils;

import java.util.ResourceBundle;

public class UrlCertificacion {

    public static final String SWAGLABS_CERTIFICATION_URL = ResourceBundle.getBundle("Data_es_ES")
            .getString("certificationURL");

    private UrlCertificacion() {
        throw new IllegalStateException("Utility class");
    }
}





