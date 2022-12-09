package com.swaglabs.certification.website.utils;

import javax.swing.*;

import static org.junit.Assert.assertTrue;

public class ManualTest {

    private ManualTest() {
        throw new IllegalStateException("Interaction with the tester");
    }

    public static void validate(String step, String nameScenario) {
        String reason = "";
        String[] options = {"No", "Yes"};
        int selectedNumericOption = JOptionPane.showOptionDialog(new JFrame(),
                "¿El paso \"" + step + "\" fue ejecutado exitosamente?", nameScenario, JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        boolean selectedOption = (selectedNumericOption == 1);
        if (!selectedOption) {
            reason = JOptionPane.showInputDialog("Ingrese la razon por la cual la prueba no se ejecuto correctamente");
        }
        assertTrue(reason, selectedOption);
    }
}