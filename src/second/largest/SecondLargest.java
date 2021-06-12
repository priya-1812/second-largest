/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second.largest;
import java.util.Scanner;
public class SecondLargest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        
           
           if(a>=b && a>=c)
           {
              if(b>=c)
              {
                System.out.println(b);
              }
              else
              {
               System.out.println(c);
              }
            
            }
            else if(b>=a && b>=c)
           {
              if(a>=c)
              {
                System.out.println(a);
              }
              else
              {
                System.out.println(c);  
              }
            }
              else if(a>=b)
              {
                System.out.println(a); 
              }
              else
              {
                System.out.println(b);
              }
           
           t--; 
        }
       
    }
    
}
