package so;

import java.util.Scanner;

public class Figuras {

	
		public static void main (String[] arg)
	    {
	      Scanner y= new Scanner(System.in);
	      int tam=0;
	      System.out.println("Dame tamaño del cuadrado");
	      tam=y.nextInt();
	      
	      for(int i=1; i<=tam;i++)
	      {
	          for(int j=1;j<=tam;j++)
	          {
	              if (j==1 || j==tam ||i==1 || i==tam)
	              {
	                System.out.print("*");
	              }else 

	              {
	                  System.out.print(" ");
	              }
	      } 
	            System.out.println();
	    }
	    
	    
	}

}
