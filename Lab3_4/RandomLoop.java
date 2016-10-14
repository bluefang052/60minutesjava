
public class RandomLoop{
    
	public static void main(String [] arg){ 
		int a = 0;
        int b = 0;
		a = (int) (Math.random() * 10 + 1);
		while(a == b)
		{
		     b = (int) (Math.random() * 10 + 1);
		     System.out.println("Trying b = " + b);
		}
		System.out.println("a = " + a + " and b = " + b);
	}
}



