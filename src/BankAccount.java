public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(int sum) {
        amount+= sum;

    }

    public void withDraw(int sum) throws LimitException  {
        if (amount < sum){
            throw  new LimitException("\nЗапрашиваемая сумма на снятие больше чем на остаток денег на счете! ",
                    amount-sum);

        }

        amount-=sum;

    }
}
