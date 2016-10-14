public class Book {

    public static void main(String[] arg) {
	    boolean isMissingData = false;
        if (arg.length < 1) {
	        System.out.println("Missing Title.");
			isMissingData = true;
		}
        if (arg.length < 2) {
		    System.out.println("Missing Author.");
			isMissingData = true;
	    }
		if (isMissingData) {
		    return;
		}
	    System.out.println("Title: " + arg[0]);
		System.out.println("Author: " + arg[1]);
	}
}