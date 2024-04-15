package C_GestionCientifica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class BuscadorTextoGUI extends JFrame {
    private JTextArea textArea;
    private JTextField searchField;
    private JButton loadButton, searchButton;
    private JFileChooser fileChooser;
    private JLabel resultLabel;

    public BuscadorTextoGUI() {
        super("Buscador de Texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        searchField = new JTextField(20);
        loadButton = new JButton("Cargar Documento");
        searchButton = new JButton("Buscar Palabra");
        resultLabel = new JLabel("Resultados de la búsqueda aparecerán aquí");
        fileChooser = new JFileChooser();