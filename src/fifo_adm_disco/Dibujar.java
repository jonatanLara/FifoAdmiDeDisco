/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fifo_adm_disco;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jonatanLara
 */
public class Dibujar {
    public static void hacerLineas(Graphics g, int x ,int y,int x1, int y1){
        //g.setColor(Color.green);
        g.drawLine(x, y, x1, y1);
    }
}
