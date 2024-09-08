package standard;

public class Swap_Variables {	 
		 public static void main(String[] args) {
		   int x, y, temp;
		   
		   x = 15;
		   y = 27;
		   
		   System.out.println("Before swapping : a -> " + x + ", b -> " + y);
		   
		   temp = x;
		   x = y;
		   y = temp;   
		   
		   System.out.println("After swapping : a -> " + x + ", b -> " + y);
		 }

}
