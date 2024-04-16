package E_Interfaz;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Interfaz {


    // Método para aplicar el estilo al botón
    public static void styleButton(JButton button) {
        button.setBackground(new Color(255, 255, 255)); // Color blanco
        button.setForeground(new Color(0, 0, 0)); // Texto en negro

        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 12));
    }

    // Método para cargar iconos
    public static ImageIcon loadIcon(String path) {
        URL url = Interfaz.class.getResource(path);
        if (url != null) {
            return new ImageIcon(url);
        }
        return null;
    }

    public static void styleFrame(JFrame frame) {
        frame.getContentPane().setBackground(new Color(214, 234, 248));

    }

    // Método para crear y estilo de una etiqueta con el logo
    public static JLabel createLogoLabel() {
        ImageIcon logoIcon = new ImageIcon("src/main/resources/uax2.png");
        if (logoIcon != null) {
            Image image = logoIcon.getImage(); // transform it
            Image newimg = image.getScaledInstance(380, 150,  Image.SCALE_AREA_AVERAGING); // scale it the smooth way
            logoIcon = new ImageIcon(newimg);
            return new JLabel(logoIcon);
        } else {
            return new JLabel("uax2.png ");
        }
    }

}
