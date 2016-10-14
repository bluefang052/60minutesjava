public class TempConverter {
    
    public static void main(String[] arg) {
        if(arg.length == 0){
            System.out.println("Missing parameter");
            return;
        }
	double f = Double.parseDouble(arg[0]);
        double celcius = (f - 32) * (double) 5 / 9;
        System.out.println(celcius);
      }
}
