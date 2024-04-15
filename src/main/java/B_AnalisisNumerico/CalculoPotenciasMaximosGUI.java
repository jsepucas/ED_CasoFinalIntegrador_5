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
}
