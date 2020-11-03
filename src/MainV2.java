public class MainV2 {

    public static void main(String[] args) {
        int amount = 100;
        int customerАccount = 100;
        customerАccount = customerАccount + amount;

        if (amount > 1000){
            int bonus = amount / 100;
            customerАccount = customerАccount + bonus;
        }
        System.out.println(customerАccount);
    }
}

