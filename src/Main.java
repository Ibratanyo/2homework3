public class Main {
    public static void main(String[] args) {
        
        BankAccount СlientBankAccount = new BankAccount();
        СlientBankAccount.deposit(10000);

        while (true){
            try{

                System.out.println("остаток на счёте: "+ СlientBankAccount.getAmount() + " сом");
                СlientBankAccount.withDraw(3000);

            }catch (LimitException e){
                System.out.println("Cнята сумма : "+ e.getRemainingAmount()+ " сом"+e.getMessage() );

                try {

                    СlientBankAccount.withDraw((int) СlientBankAccount.getAmount());
                }catch (LimitException exception){
                    exception.printStackTrace();

                }
                break;
            }

        }

        System.out.println("остаток на счёте: "+СlientBankAccount.getAmount() +"сом");


    }
}
