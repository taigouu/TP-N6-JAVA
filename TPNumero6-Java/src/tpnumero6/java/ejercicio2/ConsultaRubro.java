package tpnumero6.java.ejercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.TreeSet;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultaRubro extends JInternalFrame {

    private final TreeSet<Productos> productos;
    private final JComboBox<String> comboRubro;
    private final JTable tablaRubro;
    private final DefaultTableModel modelo;

    public ConsultaRubro(TreeSet<Productos> productos) {
        super("Listado por Rubro", true, true, true, true);
        this.productos = productos;

        modelo = new DefaultTableModel(
                new String[]{"Código", "Descripción", "Precio", "Categoría", "Stock"},
                0
        ) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };

        tablaRubro = new JTable(modelo);

        comboRubro = new JComboBox<>(new String[]{
            "Todos", "Comestible", "Limpieza", "Perfumería"
        });

        JPanel panelFiltro = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelFiltro.add(new JLabel("Rubro:"));
        panelFiltro.add(comboRubro);

        setLayout(new BorderLayout());
        add(panelFiltro, BorderLayout.NORTH);
        add(new JScrollPane(tablaRubro), BorderLayout.CENTER);

        comboRubro.addActionListener(e -> mostrarResultados());

        setSize(650, 400);
        mostrarResultados();
    }

    private void mostrarResultados() {
        modelo.setRowCount(0);
        String rubroElegido = (String) comboRubro.getSelectedItem();

        for (Productos p : productos) {
            if ("Todos".equals(rubroElegido)
                    || p.getRubros().equalsIgnoreCase(rubroElegido)) {
                modelo.addRow(new Object[]{
                    p.getCodigo(),
                    p.getDescripcion(),
                    p.getPrecio(),
                    p.getRubros(),
                    p.getStock()
                });
            }
        }
    }
}