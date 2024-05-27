package practiceCode.oop1.ex;

public class Account {
    int balance; //잔액

    void deposit(int amount) { //입금
        balance += amount;
    }

    void withdraw(int amount) { //출금
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
