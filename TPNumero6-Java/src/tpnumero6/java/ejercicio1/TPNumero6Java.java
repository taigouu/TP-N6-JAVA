/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpnumero6.java.ejercicio1;

/**
 *
 * @author Taigo Capo
 */
public class TPNumero6Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
          try {
        for (javax.swing.UIManager.LookAndFeelInfo estilo
                : javax.swing.UIManager.getInstalledLookAndFeels()) {

            if ("Nimbus".equals(estilo.getName())) {
                javax.swing.UIManager.setLookAndFeel(estilo.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException
            | IllegalAccessException
            | javax.swing.UnsupportedLookAndFeelException e) {
        e.printStackTrace();
    }
          java.awt.EventQueue.invokeLater(() -> {
    Ventana ventana = new Ventana();
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
});

        
    }
    
}
