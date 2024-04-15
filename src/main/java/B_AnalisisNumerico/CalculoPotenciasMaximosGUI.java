package B_AnalisisNumerico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoPotenciasMaximosGUI {

    private JTextField baseField, exponenteField, arrayField;
    private JButton calculatePowerButton, findMaxButton;
    private JLabel powerResultLabel, maxResultLabel;

    public CalculoPotenciasMaximosGUI() {
        super("Cálculo de Potencias y Máximos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLayout(new FlowLayout());

        baseField = new JTextField(5);
        exponenteField = new JTextField(5);
        calculatePowerButton = new JButton("Calcular Potencia");
        powerResultLabel = new JLabel("Resultado potencia aquí");
        calculatePowerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int base = Integer.parseInt(baseField.getText());
                int exponente = Integer.parseInt(exponenteField.getText());
                int result = CalculoPotenciasMaximos.calcularPotencia(base, exponente);
                powerResultLabel.setText("Potencia: " + result);
            }
        });
}
