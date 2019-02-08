package xyz.abvr.school.apcsa.sem2.labs.jan.thirtyone;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * Write a description of class CanvasComponent here.
 *
 * @author (Alex Beaver)
 * @version (a version number or a date)
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener
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
    private int motionSpeed;
    
    private int animationDeltaX = 1;
    private int animationDeltaY = 0;
    private int gutterX = 10;
    private int gutterY = 10;
    private boolean shapeSelected;
    protected Timer animationTimer;
    
    private static final int ANIMATION_TIMER_DELAY = 20;
    

    /**
     * Constructor for objects of class CanvasComponent
     */
    public CanvasComponent(int width, int height)
    {
        // initialise instance variables
        this.x=0 + gutterX;
        this.y=0 + gutterX;
        this.width = width;
        this.height = height;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addKeyListener(this);
        this.animationTimer = new Timer(ANIMATION_TIMER_DELAY,this);
        this.animationTimer.start();
        this.motionSpeed = 1;

    }
    public CanvasComponent(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addKeyListener(this);
        this.motionSpeed = 1;
        this.animationTimer = new Timer(ANIMATION_TIMER_DELAY,this);
        this.animationTimer.start();
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

        }
        else{
            this.shapeSelected = false;

        }
        this.mouseFromX = e.getX();
        this.mouseFromY = e.getY();
        
    }
    public void mouseReleased(MouseEvent e){
    }
    public void mouseMoved(MouseEvent e){
    }
    public void mouseDragged(MouseEvent e){

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
   
    public void actionPerformed(ActionEvent e){
        Dimension componentSizeDimension = this.getSize();
        if(this.x + this.width > componentSizeDimension.width-this.gutterX){
            this.animationDeltaX = 0;
            this.animationDeltaY = 1;
            this.x = componentSizeDimension.width-this.width-this.gutterX;
        }
        else if (this.y + this.height > componentSizeDimension.height - this.gutterY){
            this.animationDeltaX = -1;
            this.animationDeltaY = 0;
            this.y = componentSizeDimension.height - this.height - this.gutterY;
        }
        else if(this.x < this.gutterX){
            this.animationDeltaX = 0;
            this.animationDeltaY = -1;
            this.x = gutterX;
            this.y += this.animationDeltaY;

        }
        else if (this.y < gutterY){
            this.animationDeltaX = 1;
            this.animationDeltaY = 0;
            this.x += this.animationDeltaY;
            this.y = gutterY;
        }
        else{
            this.x += animationDeltaX * this.motionSpeed;
            this.y += animationDeltaY * this.motionSpeed;
        }
        this.repaint();
        
    }
    
    public void keyTyped(KeyEvent e){
        char keyChar = e.getKeyChar();
   
        if(keyChar == '+'){this.motionSpeed += 1;}
        else if (keyChar == '-'){if(this.motionSpeed>0){this.motionSpeed -= 1;}}
       
    }
    public void keyPressed(KeyEvent e){
    }
    public void keyReleased(KeyEvent e){
    }
    
    

    
}
