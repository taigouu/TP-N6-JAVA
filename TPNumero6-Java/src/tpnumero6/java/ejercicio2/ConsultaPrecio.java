package tpnumero6.java.ejercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.TreeSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ConsultaPrecio extends JInternalFrame {
    private final TreeSet<Productos> productos;
    private final JTextField txtDesde = new JTextField(8);
    private final JTextField txtHasta = new JTextField(8);
    private final DefaultTableModel modelo = new DefaultTableModel(
            new String[]{"Código", "Descripción", "Precio", "Categoría", "Stock"}, 0) {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public ConsultaPrecio(TreeSet<Productos> productos) {
        super("Listado por Precio", true, true, true, true);
        this.productos = productos;

        JPanel filtro = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filtro.add(new JLabel("Entre $"));
        filtro.add(txtDesde);
        filtro.add(new JLabel("y $"));
        filtro.add(txtHasta);
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
    }

    private void mostrarResultados() {
        try {
            double desde = Double.parseDouble(txtDesde.getText().trim());
            double hasta = Double.parseDouble(txtHasta.getText().trim());

            if (!Double.isFinite(desde) || !Double.isFinite(hasta)
                    || desde < 0 || hasta < desde) {
                JOptionPane.showMessageDialog(this, "Ingresá un rango de precios válido.");
                return;
            }

            modelo.setRowCount(0);
            for (Productos p : productos) {
                if (p.getPrecio() >= desde && p.getPrecio() <= hasta) {
                    modelo.addRow(new Object[]{
                        p.getCodigo(), p.getDescripcion(), p.getPrecio(),
                        p.getRubros(), p.getStock()
                    });
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresá números en ambos precios.");
        }
    }
}