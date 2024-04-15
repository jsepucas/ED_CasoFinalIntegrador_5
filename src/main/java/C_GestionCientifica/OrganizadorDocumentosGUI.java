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

        saveButton.addActionListener(e -> {
            int returnVal = fileChooser.showSaveDialog(OrganizadorDocumentosGUI.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    Files.write(fileChooser.getSelectedFile().toPath(), textArea.getText().getBytes());
                    JOptionPane.showMessageDialog(this, "Archivo guardado correctamente.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo.");
                }
            }
        });

        sortButton.addActionListener(e -> {
            String[] lines = textArea.getText().split("\n");
            Arrays.sort(lines);
            textArea.setText(String.join("\n", lines));
        });

        JPanel panel = new JPanel();
        panel.add(loadButton);
        panel.add(sortButton);
        panel.add(saveButton);


        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OrganizadorDocumentosGUI();
    }

