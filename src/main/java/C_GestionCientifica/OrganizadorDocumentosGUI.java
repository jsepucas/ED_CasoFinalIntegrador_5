import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class OrganizadorDocumentosGUI extends JFrame {
    private JTextArea textArea;
    private JButton loadButton, saveButton, sortButton;
    private JFileChooser fileChooser;

    public OrganizadorDocumentosGUI() {
        super("Organizador de Documentos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        loadButton = new JButton("Cargar");
        saveButton = new JButton("Guardar");
        sortButton = new JButton("Ordenar");
        fileChooser = new JFileChooser();

        loadButton.addActionListener(e -> {
            int returnVal = fileChooser.showOpenDialog(OrganizadorDocumentosGUI.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    List<String> lines = Files.readAllLines(fileChooser.getSelectedFile().toPath());
                    textArea.setText(String.join("\n", lines));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al cargar el archivo.");
                }
            }
        });

