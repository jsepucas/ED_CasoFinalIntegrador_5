import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class CalculoDeCombinacionesGUI extends JFrame {
    private JTextField inputField;
    private JButton generateButton;
    private JTextArea resultArea;

    public CalculoDeCombinacionesGUI() {
        super("Calculo de Combinaciones Genéticas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);
        setLayout(new FlowLayout());

        inputField = new JTextField(5);
        generateButton = new JButton("Generar");
        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
