/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelConFondo extends JPanel {
    private final String rutaImagen;
    private ImageIcon imagenFondo;

    public JPanelConFondo(String rutaImagen) {
        this.rutaImagen = rutaImagen;
        this.imagenFondo = new ImageIcon(rutaImagen);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g.create();
        
        // Establecer la opacidad
        float alpha = 0.5f; // Puedes ajustar el valor (0.0f a 1.0f)
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        
        g2d.drawImage(imagenFondo.getImage(), 0, 0, getWidth(), getHeight(), this);
        
        g2d.dispose();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        if (getWidth() > 0 && getHeight() > 0) {
            imagenFondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(getWidth(), getHeight(), java.awt.Image.SCALE_SMOOTH));
        }
    }
}
