import A_AnalisisGenomico.CalculoDeCombinacionesGUI;
import A_AnalisisGenomico.ConteoGenesGUI;

import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {
    private JButton btnConteoGenes;
    private JButton btnCalculoCombinaciones;

    public MainGUI() {
        super("Sistema de Análisis Genómico de la UAX \uD83D\uDE00 ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLayout(new FlowLayout());

        btnConteoGenes = new JButton("Conteo de Genes");
        btnCalculoCombinaciones = new JButton("Cálculo de Combinaciones");

        btnConteoGenes.addActionListener(e -> new ConteoGenesGUI());
        btnCalculoCombinaciones.addActionListener(e -> new CalculoDeCombinacionesGUI());

        add(btnConteoGenes);
        add(btnCalculoCombinaciones);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}


