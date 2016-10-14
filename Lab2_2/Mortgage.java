public class Mortgage {
    public static void main(String[] arg) {
        double principalLoan = Double.parseDouble(arg[0]);
        double interestRate = Double.parseDouble(arg[1]);
        int years = Integer.parseInt(arg[2]);
        int n = years * 12;
        double r = interestRate / 12 * 100;
        double monthlyPay = principalLoan * (r / (1 - Math.pow((1 + r),(double)(-n))));
        System.out.println(monthlyPay);
    }
}
