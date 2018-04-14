package modelo;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Cadrado{
	
    private int x;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;
    private Color corRecheo;
    private JLabel lblCadrado;
        
    public Cadrado(int x, int y, Color corRecheo) {
    	this.x = x;
    	this.y = y;
    	this.corRecheo = corRecheo;
    	JLabel cadrado = new JLabel();
    	cadrado.setBounds(this.x, this.y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
    	cadrado.setBackground(corRecheo);
    	cadrado.setOpaque(true);
    	cadrado.setBorder(new LineBorder(Color.BLACK, 2));
    	this.lblCadrado = cadrado;
    }

    public String getCoordenadas() {
        return String.valueOf(x) + " " + String.valueOf(y);
    }

    public JLabel getLblCadrado(){
        return lblCadrado;
    }

}