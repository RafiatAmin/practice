            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author rafiat.aminu
 */
import java.util.Scanner;
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String firstName = "John ";
        String lastName = " Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        byte Num = 100;
        System.out.println(Num);
        
        String txt = "What in the world?";
        char a = 65, b = 66, c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
                System.out.println("a + b + c");

        
        System.out.println("The length of the " + txt  + lastName);
        
        int x = 5;
        int y = 1;
        int d = 2;
        int z = (a - b)*(a + b);
        System.out.println ("z");
        
        System.out.println((int)3.14);
        System.out.println((double)3);
                
        int intFromString = Integer.parseInt("50");
        double doubleFromString = Double.parseDouble("50.99");
        
        System.out.println(100 + intFromString);
        System.out.println(100 + doubleFromString);
        
        System.out.println(txt.length());
        System.out.println(txt.charAt(0x0));
        System.out.println(txt.indexOf("world"));
        System.out.println(txt.indexOf("i"));
        System.out.println(txt.substring(15));
        System.out.println(txt.substring(9, 17));
        
        System.out.println(Math.pow(x, d));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.round(5.7));
        
        Scanner keyboardInput = new Scanner (System.in);
        
      //  System.out.print("Enter username: ");
      //  String username = keyboardInput.nextLine();
      //  System.out.println("Hello, " + username);
        
        int [] luckyNumbers = {4, 8, 16, 5, 10};
       // luckyNumbers [0] = 90;
        System.out.println(luckyNumbers[0]);
        System.out.println(luckyNumbers.length);
                     

    }

}
