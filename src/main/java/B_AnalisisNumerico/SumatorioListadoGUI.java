package B_AnalisisNumerico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SumatoriaListadoGUI extends JFrame {
    private JTextField inputFieldSumatoria;
    private JButton calculateSumButton;
    private JLabel sumResultLabel;
    private JTextField inputFieldDesde, inputFieldHasta;
    private JButton listNumbersButton;
    private JTextArea listResultArea;

    public SumatoriaListadoGUI() {
        super("Sumatoria y Listado de Números");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());