public class SummationProblem{
    
	public static void main(String [] arg){
		int n = Integer.parseInt(arg[0]);
		int counter = 1;
		int sum = 0;
        StringBuilder messageBuilder = new StringBuilder("");
        for (int i = 1; i <= n; i++) {
            sum += i;
            messageBuilder.append(i+"");
            if (i != n) {
                messageBuilder.append("+");
            } else {
                messageBuilder.append("=");
            }
        }
        messageBuilder.append(sum);
		System.out.println(messageBuilder.toString());
	}
}
