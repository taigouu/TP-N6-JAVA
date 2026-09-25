package tpnumero6.java.ejercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.TreeSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ConsultaNombre extends JInternalFrame {
    private final TreeSet<Productos> productos;
    private final JTextField txtBusqueda = new JTextField(18);
    private final DefaultTableModel modelo = new DefaultTableModel(
            new String[]{"Código", "Descripción", "Precio", "Categoría", "Stock"}, 0) {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public ConsultaNombre(TreeSet<Productos> productos) {
        super("Listado por Nombre", true, true, true, true);
        this.productos = productos;

        JPanel filtro = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filtro.add(new JLabel("Ingrese descripción:"));
        filtro.add(txtBusqueda);
        filtro.add(new JButton(new AbstractAction("Buscar") {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                mostrarResultados();
            }
        }));

        setLayout(new BorderLayout());
        add(filtro, BorderLayout.NORTH);
        add(new JScrollPane(new JTable(modelo)), BorderLayout.CENTER);
        setSize(650, 400);
        mostrarResultados();
    }

    private void mostrarResultados() {
        modelo.setRowCount(0);
        String busqueda = txtBusqueda.getText().trim();

        for (Productos p : productos) {
            if (p.getDescripcion().toLowerCase()
                    .contains(busqueda.toLowerCase())) {
                modelo.addRow(new Object[]{
                    p.getCodigo(), p.getDescripcion(), p.getPrecio(),
                    p.getRubros(), p.getStock()
                });
            }
        }
    }
}