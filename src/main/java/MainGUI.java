import A_AnalisisGenomico.CalculoDeCombinacionesGUI;
import A_AnalisisGenomico.ConteoGenesGUI;
import B_AnalisisNumerico.CalculoPotenciasMaximosGUI;
import B_AnalisisNumerico.SumatoriaListadoGUI;
import C_GestionCientifica.BuscadorTextoGUI;
import C_GestionCientifica.GestorFechasGUI;
import C_GestionCientifica.OrganizadorDocumentosGUI;
import E_Interfaz.Interfaz;

import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {


    private JButton btnConteoGenes;
    private JButton btnCalculoCombinaciones;
    private JButton btnSumatoriaListado;
    private JButton btnCalculoPotenciasMaximos;

    private JButton btnGestorFechas;
    private JButton btnBuscadorTexto;
    private JButton btnOrganizadorDocumentos;

    public MainGUI() {
        super("Sistema de Análisis Genómico de la UAX \uD83D\uDE00");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(525, 340);
        setLayout(new FlowLayout());

        Interfaz.styleFrame(this);

        btnConteoGenes = new JButton("Conteo de Genes 0\uFE0F⃣  1\uFE0F⃣  2\uFE0F⃣   3\uFE0F⃣");

        btnCalculoCombinaciones = new JButton("Cálculo de Combinaciones  ✖\uFE0F ➕ ➖ ➗");

        btnSumatoriaListado = new JButton("Sumatoria y Listado de Números  \uD83D\uDCC3");

        btnCalculoPotenciasMaximos = new JButton("Cálculo de Potencias y Máximos   \uD83D\uDD22   ");

        btnGestorFechas = new JButton("Gestor de Fechas \uD83D\uDCC6");

        btnBuscadorTexto = new JButton("Buscador de Texto \uD83D\uDD0E");

        btnOrganizadorDocumentos = new JButton("Organizador de Documentos \uD83D\uDCC3");


        btnConteoGenes.addActionListener(e -> new ConteoGenesGUI());
        btnCalculoCombinaciones.addActionListener(e -> new CalculoDeCombinacionesGUI());
        btnSumatoriaListado.addActionListener(e -> new SumatoriaListadoGUI());
        btnCalculoPotenciasMaximos.addActionListener(e -> new CalculoPotenciasMaximosGUI());
        btnGestorFechas.addActionListener(e -> new GestorFechasGUI());
        btnBuscadorTexto.addActionListener(e -> new BuscadorTextoGUI());
        btnOrganizadorDocumentos.addActionListener(e -> new OrganizadorDocumentosGUI());

        add(btnConteoGenes);
        add(btnCalculoCombinaciones);
        add(btnSumatoriaListado);
        add(btnCalculoPotenciasMaximos);
        add(btnGestorFechas);
        add(btnBuscadorTexto);
        add(btnOrganizadorDocumentos);

        JLabel logoLabel = Interfaz.createLogoLabel();
        add(logoLabel, BorderLayout.NORTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }


}

