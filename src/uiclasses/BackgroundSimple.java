/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiclasses;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bolivar Rafael
 */
public class BackgroundSimple extends JPanel{
    
    private File backgroundImage;
      
    public BackgroundSimple(int widht, int height, File backgroundImage){
    
        this.setSize(widht, height);
        this.backgroundImage = backgroundImage;
    
    }
    
    public void paintComponent(Graphics g){

try{
    
Image i=ImageIO.read(backgroundImage);
g.drawImage(i, 0, 0, this.getWidth(),this.getHeight(), null);

}catch(Exception e){

JOptionPane.showMessageDialog(null,"Problema al cargar datos");

        }
    }
}
