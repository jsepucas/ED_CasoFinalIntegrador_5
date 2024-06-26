package C_GestionCientifica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class BuscadorTextoGUI extends JFrame {
    private JTextArea textArea;
    private JTextField searchField;
    private JButton loadButton, searchButton;
    private JFileChooser fileChooser;
    private JLabel resultLabel;
    private Map<String, java.util.List<Integer>> invertedIndex;

    public BuscadorTextoGUI() {
        super("Buscador de Texto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(625, 400);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        searchField = new JTextField(20);
        loadButton = new JButton("Cargar Documento");
        searchButton = new JButton("Buscar Palabra");
        resultLabel = new JLabel("Resultados de la búsqueda aparecerán aquí");
        fileChooser = new JFileChooser();
        invertedIndex = new HashMap<String, java.util.List<Integer>>();

        loadButton.addActionListener(e -> {
            int returnVal = fileChooser.showOpenDialog(BuscadorTextoGUI.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    java.util.List<String> lines = Files.readAllLines(fileChooser.getSelectedFile().toPath());
                    textArea.setText(String.join("\n", lines));
                    buildInvertedIndex(lines);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al cargar el archivo.");
                }
            }
        });

        searchButton.addActionListener(e -> {
            String word = searchField.getText();
            if (invertedIndex.containsKey(word)) {
                resultLabel.setText("Palabra encontrada en líneas: " + invertedIndex.get(word));
            } else {
                resultLabel.setText("La palabra no fue encontrada en el documento.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(loadButton);
        panel.add(new JLabel("Buscar Palabra:"));
        panel.add(searchField);
        panel.add(searchButton);

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void buildInvertedIndex(java.util.List<String> lines) {
        invertedIndex.clear();
        for (int i = 0; i < lines.size(); i++) {
            String[] words = lines.get(i).split("\\W+");
            for (String word : words) {
                word = word.toLowerCase();
                if (!invertedIndex.containsKey(word)) {
                    invertedIndex.put(word, new ArrayList<Integer>());
                }
                invertedIndex.get(word).add(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        new BuscadorTextoGUI();
    }
}