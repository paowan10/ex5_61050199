/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bound;
import java.util.Scanner;

/**
 *
 * @author JAY
 */
public class Bound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyBean mySource = new MyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter Score = ");
            String value = sc.nextLine();
            if (value.equals("")) {
                break;
            }
            mySource.setvalue(value);
        }
        
    }
    
}
