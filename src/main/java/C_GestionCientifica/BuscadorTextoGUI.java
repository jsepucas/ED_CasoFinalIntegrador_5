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
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        searchField = new JTextField(20);
        loadButton = new JButton("Cargar Documento");
        searchButton = new JButton("Buscar Palabra");
        resultLabel = new JLabel("Resultados de la búsqueda aparecerán aquí");
        fileChooser = new JFileChooser();

        loadButton.addActionListener(e -> {
            int returnVal = fileChooser.showOpenDialog(BuscadorTextoGUI.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    List<String> lines = Files.readAllLines(fileChooser.getSelectedFile().toPath());
                    textArea.setText(String.join("\n", lines));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al cargar el archivo.");
                }
            }
        });

        searchButton.addActionListener(e -> {
            if (fileChooser.getSelectedFile() != null) {
                try {
                    List<Integer> lineNumbers = BuscadorTexto.buscarPalabra(fileChooser.getSelectedFile().getPath(), searchField.getText());
                    if (lineNumbers.isEmpty()) {
                        resultLabel.setText("La palabra no fue encontrada en el documento.");
                    } else {
                        resultLabel.setText("Palabra encontrada en líneas: " + lineNumbers);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al buscar en el documento.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, cargue un documento primero.");
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

    public static void main(String[] args) {
        new BuscadorTextoGUI();
    }
}