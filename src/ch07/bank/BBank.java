package ch07.bank;

public class BBank extends Bank {
    @Override
    public double getInterestRate() {
        return super.getInterestRate() + 5.0;
    }
}
