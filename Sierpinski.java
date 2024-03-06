package Sierpinski_shell;

import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sier extends JPanel
{
    /*THIS SHOULD BE CHANGED TO HIGHER NUMBERS FOR TESTING!!!*/
    int n = 0; //sets the levels of recursion; this starts at 0 but you should test it at larger values
    /*****************************/
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        //Draw the outermost triangle here
        
        fractal(/*insert appropriate arguments here*/);
       
    }
    public static void main(){
        JFrame window = new JFrame("Sierpinski's Triangle");
        window.setBounds(100, 100, 700, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        sier panel = new sier();
        panel.setBackground(Color.WHITE); 
        Container c = window.getContentPane(); 
        c.add(panel); 
        window.setVisible(true); 
    }
    public void fractal(int x1, int y1, int x2, int y2, int x3, 
                            int y3, int n, Graphics g) {
    //implement!
    //will involve a drawing, a conditional, and at least one recursive call.

    }

}
