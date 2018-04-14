package modelo;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Cadrado{
	
    private int x;
    private int y;
    private Color corRecheo;
    private JLabel lblCadrado;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        lblCadrado.setBounds(x, y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
        lblCadrado.repaint();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        lblCadrado.setBounds(x, y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
        lblCadrado.repaint();
    }

    public Color getCorRecheo() {
        return corRecheo;
    }

    public void setCorRecheo(Color corRecheo) {
        this.corRecheo = corRecheo;
        lblCadrado.setBackground(corRecheo);
        lblCadrado.repaint();
    }

    public Cadrado(int x, int y, Color corRecheo, Xogo xogo) {
    	this.x = x;
    	this.y = y;
    	this.corRecheo = corRecheo;
    	lblCadrado = new JLabel();
    	lblCadrado.setBackground(corRecheo);
    	lblCadrado.setBounds(x, y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
    	lblCadrado.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    	lblCadrado.setVisible(true);
    	lblCadrado.setOpaque(true);
        xogo.getVentanaPrincipal().pintarCadrado(this.lblCadrado);

    //	JLabel cadrado = new JLabel();
    //	cadrado.setBounds(this.x, this.y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
    //	cadrado.setBackground(corRecheo);
    //	cadrado.setOpaque(true);
    //	cadrado.setBorder(new LineBorder(Color.BLACK, 2));
    //	this.lblCadrado = cadrado;
    }

    public String getCoordenadas() {
        return String.valueOf(x) + " " + String.valueOf(y);
    }

    public JLabel getLblCadrado(){
        return lblCadrado;
    }

}