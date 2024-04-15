package C_GestionCientifica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BuscadorTextoGUI {

    public class BuscadorTextoGUI extends JFrame {
        private JTextArea textArea;
        private JTextField searchField;
        private JButton loadButton, searchButton;
        private JFileChooser fileChooser;
        private JLabel resultLabel;

        public BuscadorTextoGUI() {
            super("Buscador de Texto");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(500, 400);
            setLayout(new BorderLayout());

            textArea = new JTextArea();
            searchField = new JTextField(20);
            loadButton = new JButton("Cargar Documento");
            searchButton = new JButton("Buscar");
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
                try {
                    List<Integer> lineNumbers = BuscadorTexto.buscarPalabra(fileChooser.getSelectedFile().getPath(), searchField.getText());
                    resultLabel.setText("Palabra encontrada en líneas: " + lineNumbers);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al buscar en el documento.");
                }
            });



    }
