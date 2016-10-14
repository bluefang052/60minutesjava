public class CongratulateStudents{
    
	public static void main(String [] arg){
	    char grade = arg[0].charAt(0);
        	
			if(grade == "A".charAt(0)){
				System.out.println("Excellent!");
			}
			
			else if(grade == "B".charAt(0) || grade == "C".charAt(0)){
				System.out.println("Well done!");
			}
			
			else if(grade == "D".charAt(0)){
				System.out.println("You passed");
			}
			
			else if(grade == "F".charAt(0)){
				System.out.println("Better try again");
			}
			
			else{
			}
			
		}
	}


