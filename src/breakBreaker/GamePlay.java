
package breakBreaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer ;

/**
 *
 * @author Faruk Ahmad
 */
public class GamePlay extends JPanel implements KeyListener, ActionListener {
    private boolean play=false ;
    private int score = 0 ;
    private int totalBrickes=21 ;
    private Timer timer ;
    private int delay= 8;
    private int playerX= 310 ;
    private int ballposX=120 ;
    private int ballposY=350 ;
    private int balldirX=-1 ;
    private int balldierY= -2 ;
    private MapGenarator map ;
    
    public GamePlay(){
        map=new MapGenarator (3 ,7) ;
       addKeyListener(this) ;
       setFocusable(true);
       setFocusTraversalKeysEnabled(false);
      timer=new Timer(delay,this) ;
      timer.start();
       
    }
    
    public void paint(Graphics g){
        //background
        g.setColor(Color.black);
        g.fillRect(1,1, 692, 592);
        //map
        map.draw((Graphics2D)g) ;
        
        //boder
        
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3,592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);
        
        //padel
        g.setColor(Color.GREEN);
        g.fillRect(playerX,550,100,8) ;
        
        //ball
         g.setColor(Color.YELLOW);
        g.fillOval(ballposX,ballposY,20,20) ;
        g.dispose();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       if(ke.getKeyCode() == KeyEvent.VK_RIGHT) {
           if(playerX >=600){
               playerX = 600 ;
           }
           else{
               moveRight() ;
           }
       }
       if(ke.getKeyCode() == KeyEvent.VK_LEFT){
          if(playerX <10 ){
               playerX = 10 ;
           }
           else{
               moveLeft() ;
           } 
       }
    }
         public void moveRight(){
          play=true ;
          playerX+=20 ;
         }
           public void moveLeft(){
          play=true ;
          playerX-=20 ;
           
}
    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       timer.start();
       if(new Rectangle(ballposX,ballposY,20,20).intersects(new Rectangle (playerX, 550,100,8))){
        balldierY = -balldierY ; 
    }
       for(int i=0;i<map.map.length ;i++) {
           for(int j=0 ;j<map.map[0].length ;j++){
              if(map.map[i][j] > 0) {
                  int brickX =j*map.breakWidth + 80 ;
                  int brickY =i*map.breakHeigth +50 ;
                  int brickWidth=map.breakWidth ;
                  int brickHeigth =map.breakHeigth ;
                  
                  Rectangle rect =new Rectangle(brickX ,brickY,brickWidth,brickHeigth) ;
                  Rectangle ballRect =new Rectangle(ballposX ,ballposY,20,20) ;
                  Rectangle brickRect = rect ;
                  
                  if(ballRect.intersects(brickRect)){
                      map.setBreakValue(0, j, j);
                      
                      score+=5 ;
                  }
              }
           }
       }
       
       if(play){
           ballposX += balldirX ;
           ballposY += balldierY ;
           if(ballposX  < 0){
               balldirX = -balldirX ;
           }
            if(ballposY  < 0){
               balldierY = -balldierY ;
           }
             if(ballposX  > 670){
               balldirX = -balldirX ;
           }
       }
       repaint() ;
    }
    
    
}
