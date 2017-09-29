/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accessdemo;

/**
 *
 * @author OOtumbay
 */
class MyClass{
private int alpha;
public int beta;
int gamma;

void setAlpha(int a) {
    alpha=a;
}
int getAlpha() {
    return alpha;
}
}
public class AccessDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass ob=new MyClass();
        ob.setAlpha(-99);
        System.out.println("ob.alpha: "+ob.getAlpha());
        ob.beta=88;
        ob.gamma=980;
        
    }
    
}
