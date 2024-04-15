import A_AnalisisGenomico.CalculoDeCombinacionesGUI;
import A_AnalisisGenomico.ConteoGenesGUI;
import B_AnalisisNumerico.CalculoPotenciasMaximosGUI;
import B_AnalisisNumerico.SumatoriaListadoGUI;

import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {
    private JButton btnConteoGenes;
    private JButton btnCalculoCombinaciones;
    private JButton btnSumatoriaListado;
    private JButton btnCalculoPotenciasMaximos;

    public MainGUI() {
        super("Sistema de Análisis Genómico de la UAX \uD83D\uDE00");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new FlowLayout());

        btnConteoGenes = new JButton("Conteo de Genes \uD83D\uDD22 ");
        btnCalculoCombinaciones = new JButton("Cálculo de Combinaciones  ✖\uFE0F ➕ ➖ ➗");
        btnSumatoriaListado = new JButton("Sumatoria y Listado de Números  \uD83D\uDCC3");
        btnCalculoPotenciasMaximos = new JButton("Cálculo de Potencias y Máximos  0\uFE0F⃣  1\uFE0F⃣  2\uFE0F⃣   3\uFE0F⃣  ");

        btnConteoGenes.addActionListener(e -> new ConteoGenesGUI());
        btnCalculoCombinaciones.addActionListener(e -> new CalculoDeCombinacionesGUI());
        btnSumatoriaListado.addActionListener(e -> new SumatoriaListadoGUI());
        btnCalculoPotenciasMaximos.addActionListener(e -> new CalculoPotenciasMaximosGUI());

        add(btnConteoGenes);
        add(btnCalculoCombinaciones);
        add(btnSumatoriaListado);
        add(btnCalculoPotenciasMaximos);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}

