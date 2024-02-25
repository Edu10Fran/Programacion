package exercise01;

import javax.swing.*;

public class PanelEjemplo {
    public static void main(String[] args) {
        // Crear un nuevo frame (ventana)
        JFrame frame = new JFrame("Ejemplo de Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700); // Tamaño de la ventana

        // Crear un nuevo panel
        JPanel panel = new JPanel();

        // Crear etiquetas para mostrar información
        JLabel etiqueta1 = new JLabel("Nombre: Juan");
        JLabel salto = new JLabel("\n");
        JLabel etiqueta2 = new JLabel("Edad: 30" + "\n");
        JLabel etiqueta3 = new JLabel("Ciudad: Madrid");

        // Añadir etiquetas al panel
        panel.add(etiqueta1);
        panel.add(salto);
        panel.add(etiqueta2);
        panel.add(etiqueta3);

        // Añadir el panel al frame
        frame.add(panel);

        // Hacer visible el frame
        frame.setVisible(true);
    }
}