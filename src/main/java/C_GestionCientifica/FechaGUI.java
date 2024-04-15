package C_GestionCientifica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FechaGUI {

    private JTextField fechaField, descripcionField;
    private JButton addButton, editButton, deleteButton, sortButton;
    private JTable fechasTable;
    private DefaultTableModel tableModel;
    private List<Fecha> fechas;

    public GestorFechasGUI() {
        super("Gestor de Fechas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        fechas = new ArrayList<>();
        setLayout(new BorderLayout());
}
