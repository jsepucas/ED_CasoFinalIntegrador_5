package C_GestionCientifica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FechaGUI extends JFrame {

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

        fechaField = new JTextField(10);
        descripcionField = new JTextField(20);
        addButton = new JButton("Agregar");
        editButton = new JButton("Editar");
        deleteButton = new JButton("Eliminar");
        sortButton = new JButton("Ordenar");

        String[] columnNames = {"Fecha", "Descripción"};
        tableModel = new DefaultTableModel(columnNames, 0);
        fechasTable = new JTable(tableModel);

        addButton.addActionListener(e -> {
            try {
                LocalDate fecha = LocalDate.parse(fechaField.getText(), DateTimeFormatter.ISO_DATE);
                String descripcion = descripcionField.getText();
                fechas.add(new Fecha(fecha, descripcion));
                tableModel.addRow(new Object[]{fecha, descripcion});
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Formato de fecha no válido. Use YYYY-MM-DD.");
            }
        });
}
