class Bank {

    int balance = 10000;

    void display() {
        System.out.println("Balance = " + balance);
    }
}

public class Exp64_BankPackage {

    public static void main(String[] args) {

        Bank b = new Bank();
        b.display();
    }
}   
