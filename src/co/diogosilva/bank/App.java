package co.diogosilva.bank;

public class App {
    public static void main(String[] args) {

        // criar uma conta de usuario ( agencia, conta, nome)
        Account account = new Account("001", "1234", "Diogo");
        Account account2 = new Account("001", "1234", "alex");

        // sacar valores =  não pode sacra mais do que tem
        boolean succeed = account.withDraw(200.0);
        if (!succeed){
            System.out.println("Você não tem saldo suficiente para sacar!");
        }
        //Depositar
        account.deposit(100);
        account.deposit(50);
        account.deposit(100);

        if (!account.withDraw(200)){
            System.out.println("Você não tem saldo suficiente para sacar!");
        }
        if (!account.withDraw(200)){
            System.out.println("Você não tem saldo suficiente para sacar!");
        }
        // iNFORMAR PARA O USUARIO AS OPERAÇÕES (SAQUE, DEPOSITO)
        if (!account.withDraw(200)){
            System.out.println(account);
        }
    }





}

