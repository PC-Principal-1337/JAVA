package a64;

public class TuermeVonHanoi {
	
		 private static void bewege (char a, char b, char c, int n){
		 int nkonstant=n;  
		 while(c!=nkonstant)
		 {
			if(n%2==1){
			System.out.println("Lege oberste Scheibe von a auf c");
			
			System.out.println("Lege oberste Scheibe von a auf b");
			System.out.println("Lege oberste Scheibe von c auf b");
			System.out.println("Lege oberste Scheibe von a auf c");
			}
			if(n%2==0){
			System.out.println("Lege oberste Scheibe von a auf b");
			System.out.println("Lege oberste Scheibe von a auf c");
			System.out.println("Lege oberste Scheibe von b auf c");
			System.out.println("Lege oberste Scheibe von a auf b");
			 
			}
		    }
		 }
		 
		    public static void main (String[] args)
		    {
			bewege('a', 'b', 'c', 4);
		    }

		}