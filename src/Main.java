public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1100;
        int bonus;
        if (deposit>1000) {
            bonus = deposit/100;
        }else {
            bonus = 0;
        }
    int totalBalance = balance + deposit + bonus;
        System.out.println("Current Balance: "+totalBalance);
        System.out.println("Bonus: "+bonus);


    }
}
