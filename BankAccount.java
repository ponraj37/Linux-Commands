public class BankAccount{
     private int accNum;
     private double balance;
     private String owner;
     
     public BankAccount(int accNum, double balance, String owner){
            this.accNum=accNum;
            this.balance=balance;
            this.owner=owner;
     }
     public double getBalance(){
          return balance;
     }
     public void setBalance(double balance){
              this.balance=balance;
     }
     private int getAccNumber(){
              return accNum;
     }
     private void setAccNumber(int accNum){
              this.accNum=accNum;
     }
     private String getOwner(){
              return owner;
     }
     private void setOwner(String owner){
            this.owner=owner;
     }
     
     public void printBankAccount(){
          System.out.println("Account balance is: "+balance);
     }
     
     public static void main(String[] args){
              
              BankAccount user=new BankAccount(1234244, 23424, "Ponraj");
              
              user.printBankAccount();
     }
}
