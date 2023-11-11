/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class JPanelColor extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Define el gradiente lineal
        GradientPaint gradient = new GradientPaint(0, 0, new Color(249, 138, 7), getWidth(), getHeight(), new Color(239, 208, 22));

        // Rellena el JPanel con el gradiente
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600); // Ajusta las dimensiones según tus necesidades
    }
    
}
