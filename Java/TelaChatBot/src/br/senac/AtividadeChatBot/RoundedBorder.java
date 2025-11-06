/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.AtividadeChatBot;
import java.awt.*;
import javax.swing.border.AbstractBorder;
/**
 *
 * @author MIGUELVARGASFERREIRA
 */

    public class RoundedBorder extends AbstractBorder {
    private final int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(8, 12, 8, 12); // margem interna pro texto não encostar na borda
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = 12;
        insets.right = 12;
        insets.top = 8;
        insets.bottom = 8;
        return insets;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.GRAY); // cor da borda
        g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}
