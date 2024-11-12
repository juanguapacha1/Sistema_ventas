/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simtemaventas;
import javax.swing.JFrame;

/**
 *
 * @author juan
 */
public class SimtemaVentas {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Sistema de Ventas");

        // Crear una instancia del panel interfas
        interfas panelInterfaz = new interfas();

        // Agregar el panel interfas al JFrame
        ventana.add(panelInterfaz);

        // Configurar el tamaño de la ventana
        ventana.setSize(600, 400); // Puedes ajustar el tamaño según necesites

        // Cerrar la aplicación al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer visible la ventana
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
