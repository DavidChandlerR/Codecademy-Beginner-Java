public class ATM{
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATM(int inputMoney){
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }
    /*
    Edit the withdrawMoney() method so when money is taken out of a specific ATM, 
    The static variable totalMoney also reflects that change.
    */
    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }
/*
Let’s write a static method that prints the average amount of money in all vending machines in the system.
The method name should be averageMoney and it should be void since it doesn’t return anything.
The method should print totalMoney divided by numATMs. Note that both of those variables are static.
 */
    public static void averageMoney(){
        System.out.println(totalMoney / numATMs);
    }

    public static void main(String[] args){

        System.out.println("Total number of ATMs: " + ATM.numATMs);
        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(500);
        System.out.println("Total number of ATMs: " + ATM.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);

        // Call averageMoney() here
        ATM.averageMoney();
    }
}