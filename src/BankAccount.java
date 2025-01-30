public class BankAccount {
    public static void main(String[] args) {
        float bobsBalance = 2175.370f;

        System.out.println("Bob's old balance: " + bobsBalance);

        bobsBalance -= 302.50;
        bobsBalance += 50.03;
        bobsBalance -= (bobsBalance / 2 - 20);
        bobsBalance -= 1.00;
        bobsBalance *= 2.00;
        bobsBalance += 1.00;

        System.out.printf("Bob's new balance: %.2f%n", bobsBalance);
    }
}
