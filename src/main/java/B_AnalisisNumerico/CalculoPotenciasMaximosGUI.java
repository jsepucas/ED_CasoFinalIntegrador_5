package B_AnalisisNumerico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoPotenciasMaximosGUI extends JFrame {

    private JTextField baseField, exponenteField, arrayField;
    private JButton calculatePowerButton, findMaxButton;
    private JLabel powerResultLabel, maxResultLabel;

    public CalculoPotenciasMaximosGUI() {
        super("Cálculo de Potencias y Máximos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

        arrayField = new JTextField(20);
        findMaxButton = new JButton("Encontrar Máximo");
        maxResultLabel = new JLabel("Máximo aquí");
        findMaxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] parts = arrayField.getText().split(",");
                int[] datos = new int[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    datos[i] = Integer.parseInt(parts[i].trim());
                }
                int result = CalculoPotenciasMaximos.encontrarMaximo(datos, datos.length - 1);
                maxResultLabel.setText("Máximo: " + result);
            }
        });

        add(new JLabel("Base:"));
        add(baseField);
        add(new JLabel("Exponente:"));
        add(exponenteField);
        add(calculatePowerButton);
        add(powerResultLabel);
        add(new JLabel("Array (comma separated):"));
        add(arrayField);
        add(findMaxButton);
        add(maxResultLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CalculoPotenciasMaximosGUI();
    }
}
