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
