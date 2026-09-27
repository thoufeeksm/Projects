 class Customer {
    private int customerid;
    private String customername;
    private long phoneno;

    public Customer(int customerid, String customername, long phoneno) {
        this.customerid=customerid;
        this.customername=customername;
        this.phoneno=phoneno;
    }
    int getcid(){
        return customerid;
    }
    String getcname(){
        return customername;
    }
    long getcno(){
        return phoneno;
    }
    
    
}
