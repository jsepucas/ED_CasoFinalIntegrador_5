package A_AnalisisGenomico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConteoGenesGUI extends JFrame {
    private JTextField inputField;
    private JButton countButton;
    private JLabel resultLabel;

    public ConteoGenesGUI() {
        super("Conteo de Genes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setLayout(new FlowLayout());

        inputField = new JTextField(20);
        countButton = new JButton("Contar Genes");
        resultLabel = new JLabel("Resultado aparecerá aquí");

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dna = inputField.getText();
                int result = ConteoGenes.contarGenes(dna);
                resultLabel.setText("Número de genes: " + result);
            }
        });

        add(inputField);
        add(countButton);
        add(resultLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConteoGenesGUI();
    }
}