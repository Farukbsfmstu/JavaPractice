
package inharitance;

/**
 *
 * @author Faruk Ahmad
 */
public class PrivateRaba extends PrivateMim {
    int roll ;
    
    public void setroll(int roll){
        this.roll=roll ;
    }
    
    public int getroll(){
        return roll ;
    }
    
    void Display(){
         System.out.println("name: "+getname());
        System.out.println("gendre: "+getgendre());
        System.out.println("roll: "+getroll());
    }
    
}
