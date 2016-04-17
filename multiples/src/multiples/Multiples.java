/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;
import java.util.Scanner;
/**
 *
 * @author mike
 */
public class Multiples 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
    Scanner get = new Scanner(System.in);
    int x, y, z;
    
    System.out.print("Enter a value for x: ");
            x = get.nextInt();
    System.out.print("Enter a value for y: ");
            y = get.nextInt();
        for(z=1;x*z<=y;z++)
        {
            
            
            System.out.printf("%d\n", x*z);
            
            
        }
        int b = 1;
        do
        {
            
            System.out.printf("%d\n", x*b++);
            
        }while(x*b<=y);
    }
}
