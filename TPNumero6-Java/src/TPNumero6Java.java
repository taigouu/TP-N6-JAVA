public static void main(String[] args) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo estilo
                : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(estilo.getName())) {
                javax.swing.UIManager.setLookAndFeel(estilo.getClassName());
                break;
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    java.awt.EventQueue.invokeLater(() -> {
        String[] opciones = {"Ejercicio 1", "Ejercicio 2"};

        int elegido = javax.swing.JOptionPane.showOptionDialog(
                null,
                "¿Qué ejercicio querés abrir?",
                "Trabajo Práctico 6",
                javax.swing.JOptionPane.DEFAULT_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (elegido == 0) {
            tpnumero6.java.ejercicio1.Ventana ventana =
                    new tpnumero6.java.ejercicio1.Ventana();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        } else if (elegido == 1) {
            tpnumero6.java.ejercicio2.Ventana2 ventana =
                    new tpnumero6.java.ejercicio2.Ventana2();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
    });
}