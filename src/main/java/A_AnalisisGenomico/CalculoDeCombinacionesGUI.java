package A_AnalisisGenomico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class CalculoDeCombinacionesGUI extends JFrame {
    private JTextField inputField;
    private JButton generateButton;
    private JTextArea resultArea;

    public CalculoDeCombinacionesGUI() {
        super("Calculo de Combinaciones Genéticas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        inputField = new JTextField(5);
        generateButton = new JButton("Generar");
        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);

        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(inputField.getText());
                    if (n < 1 || n > 10) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entre 1 y 10.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                        resultArea.setText("");
                    } else {
                        List<String> combinaciones = CalculoDeCombinaciones.generarCombinaciones(n);
                        resultArea.setText("");
                        for (String comb : combinaciones) {
                            resultArea.append(comb + "\n");
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    resultArea.setText("");
                }
            }
        });

        add(new JLabel("Tamaño:"));
        add(inputField);
        add(generateButton);
        add(new JScrollPane(resultArea));

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculoDeCombinacionesGUI();
    }
}
