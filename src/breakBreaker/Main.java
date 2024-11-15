
package breakBreaker;

import javax.swing.JFrame;

/**
 *
 * @author Faruk Ahmad
 */
public class Main {
    public static void main(String args[]){
        
        JFrame ob=new JFrame();  
        GamePlay gameplay=new GamePlay();
        ob.setBounds(10, 10,700, 600);
        ob.setTitle("Breakout Ball");
        ob.setResizable(false);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.add(gameplay) ;
    }
    
}
