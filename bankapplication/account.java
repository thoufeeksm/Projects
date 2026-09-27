class account {
    private long accountno;
    private String name;
    private String ifscnumber;
    private String Address;
    private double balance=0;

    public account(long accountno,String name,String ifscnumber,String Address) {
        this.accountno=accountno;
        this.name=name;
        this.ifscnumber=ifscnumber;
        this.Address=Address;
   
    }
    long getno(){
        return accountno;
    }
    String getname(){
        return name;
    }
    String getifscno(){
        return ifscnumber;
    }
    String getadd(){
        return  Address;
    }
    void deposit(double amount)
    {
balance=balance+amount;
    }
    void withdraw(double amount){
        if(balance>=amount){
        balance=balance-amount;
    }else{
        System.out.println("--Insufficient Balance....--");
    }
    }
    double getbalance(){
      return balance;
    }
    void displaybal(){
        System.out.println("Current balance: "+balance);
    }
}
