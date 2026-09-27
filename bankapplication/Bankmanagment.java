
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Bankmanagment {
    ArrayList<account> accounts=new ArrayList<>();
     Scanner scan=new Scanner(System.in);
  
public static void main(String[] args) {
    Bankmanagment  bm=new Bankmanagment();
       
     
      
         int choice;
      
        do { 
        System.out.println("---BankMangment System---");
        System.out.println("1.create Account");
        System.out.println("2.Deposit Money");
        System.out.println("3.withdraw Money");
        System.out.println("4.Balance Checking");
        System.out.println("5.viewing Accounts");
        System.out.println("6.Exit");
        System.out.println("Enter Your Choices:");
        choice=bm.scan.nextInt();
        bm.scan.nextLine();
            switch (choice) {
                case 1:
                bm.createaccount();
                    break;
                case 2:
                    bm.depositmoney();
                    break;
                case 3:
                    bm.withdrawmoney();
                    break;
                case 4:
                    bm.checkbalance();
                    break;
                case 5:
                   bm.viewaccount();
                   break;
                case 6:
                    System.out.println("Exiting..");        
                
            }
            
        } while (choice!=6);  
} void createaccount(){
        System.out.println("----Acount Creation---");
        System.out.println("Enter The Name: ");
        String name=scan.nextLine();
       
        System.out.println("Enter the IFSC Code: ");
        String ifscnumber=scan.nextLine();
        System.out.println("Enter the Address: ");
        String Address=scan.nextLine();
        Random random=new Random();
        int accountno=100000+random.nextInt(900000);
        account acc=new account(accountno, name, ifscnumber, Address);
        accounts.add(acc);
        System.out.println("Your Account number will be: "+accountno);


    }
    void depositmoney(){
        System.out.println("Enter the Account number in which the amount to be deposit");
        long accountno=scan.nextLong();
        System.out.println("Enter the Amount to be deposit:");
        double amount=scan.nextDouble();
        boolean found=false;
        for(int i=0;i<accounts.size();i++)
        {
            if(accounts.get(i).getno()==accountno){
                found=true;
                accounts.get(i).deposit(amount);
                System.out.println("Amount Deposite Succssfully");
break;

            }
        }
        if(!found){
            System.out.println("Account number is not available");
        }

    }
void withdrawmoney(){
    System.out.println("Enter the Account number in which the amount to be withdraw");
        long accountno=scan.nextLong();
        System.out.println("Enter the Amount to be withdraw:");
        double amount=scan.nextDouble();
          boolean found=false;
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getno()==accountno)
            {
                found=true;
                accounts.get(i).withdraw(amount);
                
                break;
            }

        }
        if(!found){
            System.out.println("Accoun is not exists...");
        }
    }
        void checkbalance(){
             System.out.println("Enter the Account number to check balance");
        long accountno=scan.nextLong();
            boolean found=false;
               for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getno()==accountno)
            {
                found=true;
            accounts.get(i).displaybal();
                break;
            }


        }
        if(!found){
            System.out.println("Account not exists");

        }


}  
void viewaccount(){
    for(account accu:accounts){
        System.out.println("Name:"+accu.getname());
        System.out.println("IFSC Code: "+accu.getifscno());
        System.out.println("Address: "+accu.getadd());
        System.out.println("Account Number: "+accu.getno());
        System.out.println("Balance: "+accu.getbalance());
    }

}  
}

