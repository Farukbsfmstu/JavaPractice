
package breakBreaker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Faruk Ahmad
 */
public class MapGenarator {
    public int map[][] ;
    public int breakWidth ;
    public int breakHeigth ;
    
    public MapGenarator(int row ,int col) {
        map=new int [row] [col] ;
        for(int i=0;i<map.length ;i++){
            for(int j=0;j<map[0].length ;j++){
                map[i][j]=1 ;
                
            }
        }
        breakWidth=540/col ;
        breakHeigth = 150/row ;
    }
    public void draw(Graphics2D g) {
        for(int i=0;i<map.length ;i++){
            for(int j=0;j<map[0].length ;j++){
                if(map[i][j]>0){
                    g.setColor(Color.WHITE) ;
                    g.fillRect(j*breakWidth +80 , i*breakHeigth +50 ,breakWidth ,breakHeigth) ;
                    
                    g.setStroke(new BasicStroke(3)) ;
                    g.setColor(Color.BLACK) ;
                    g.drawRect(j*breakWidth +80 , i*breakHeigth +50 ,breakWidth ,breakHeigth) ;
                }
   
            }

        }
    }
    public void setBreakValue (int Value , int row, int col) {
        map[row][col]=Value ;
    }
}
