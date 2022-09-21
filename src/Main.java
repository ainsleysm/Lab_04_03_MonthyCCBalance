public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000.00;
        double interest = balance * 0.17;
        double oneBalance = interest + balance;
        double twoInterest = oneBalance * 0.17;
        double twoBalance = twoInterest + oneBalance;

        System.out.println("Your month one balance is: $" + oneBalance);
        System.out.println("Your month two balance is: $" + twoBalance);

    }
}