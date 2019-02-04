package xyz.abvr.school.apcsa.sem2.labs.jan.thirtyone;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * Write a description of class CanvasComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int height;
    private int width;
    
    private int mouseFromX;
    private int mouseFromY;
    private int mouseToX;
    private int mouseToY;
    private boolean shapeSelected;

    /**
     * Constructor for objects of class CanvasComponent
     */
    public CanvasComponent(int width, int height)
    {
        // initialise instance variables
        this.x=0;
        this.y=0;
        this.width = width;
        this.height = height;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        

    }
    public CanvasComponent(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(this.x,this.y,this.width,this.height);

    }
    public void setSize(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public void mouseClicked(MouseEvent e){
    }
    public void mousePressed(MouseEvent e){
        if(e.getX() < this.x + this.width && e.getX()> this.x && e.getY() < this.y + this.height && e.getY() > this.y){
            this.shapeSelected = true;
            System.out.println("Shape selected");
        }
        else{
            this.shapeSelected = false;
            System.out.println("Shape not selected");
        }
        this.mouseFromX = e.getX();
        this.mouseFromY = e.getY();
        
    }
    public void mouseReleased(MouseEvent e){
    }
    public void mouseMoved(MouseEvent e){
    }
    public void mouseDragged(MouseEvent e){
        System.out.println("MOUSE DRAGGED");
        if(this.shapeSelected){
            this.mouseToX = e.getX();
        this.mouseToY = e.getY();
        this.x += this.mouseToX - this.mouseFromX;
        this.y += this.mouseToY - this.mouseFromY;
        this.mouseFromX = e.getX();
        this.mouseFromY = e.getY();
        this.repaint();
        }
        
    }
    public void mouseEntered(MouseEvent e){
    }
    public void mouseExited(MouseEvent e){
    }
   
    
    

    
}
