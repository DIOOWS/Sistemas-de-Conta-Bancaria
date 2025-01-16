package co.diogosilva.bank;

public class Account {
    private static final int MAX_LENGTH = 12;  // limitar o nome =  12 caracteres
    private String ag;
    private String cc;
    private String name;
    private double balance;
    private  Log logger;

    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        this.name = name;
        setName(name);
        logger = new Log();
    }

    public void setName(String name){
        if (name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH);
        }else{
            this.name = name;
        }
    }

    public void deposit(double value){
        balance += value;
        logger.out("DEPOSITP - Sua conta é de R$ " + balance);
    }

    public boolean withDraw(double value){
        if(balance < value){
            logger.out("SAQUE - Seu saldo é de R$: " + balance );
            return false;
        }
            balance -= value;
            logger.out("SAQUE - Sua conta é de R$ " + balance);
            return true;
    }

    @Override
    public String toString() {
        //essas duas linhas comentadas é a mesma coisa que o return que esta em baixo
        //eturn result = "A conta " + this.name + " " + this.ag + " / " + this.cc + " possui: R$" + balance;
        //return result;

        return "A conta " + this.name + " " + this.ag + " / " + this.cc + " possui: R$" + balance;
    }
}
