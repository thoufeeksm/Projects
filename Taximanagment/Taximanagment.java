import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
class  Taximanagment{
    Scanner scan=new Scanner(System.in);
    ArrayList<Taxi> taxis=new ArrayList<>();
    ArrayList<Customer> customers=new ArrayList<>();
    ArrayList<Booking> bookings=new ArrayList<>();
    
    public static void main(String[] args) {
        Taximanagment tm=new Taximanagment();
       int choice;
       do { 
        System.out.println("----Taxi Managment System---");
        System.out.println("1.Add Taxi");
        System.out.println("2.view Taxi");
        System.out.println("3.Add Customer");
        System.out.println("4.view Customer"); 
        System.out.println("5.Book Taxi");
        System.out.println("6.View booked Taxi");
        System.out.println("7.exit");
        System.out.println("Enter Your Choice");
        choice =tm.scan.nextInt();
        tm.scan.nextLine();
        switch (choice) {
            case 1:
                tm.addtaxi();
                break;
            case 2:
                tm.viewtaxi();
                break;
            case 3:
                tm.addcustomer();
                break;
            case 4:
                tm.viewcustomer();
                break;
            case 5:
                tm.booktaxi();
                break;
            case 6:
                tm.viewbooking();
                break;
            case 7:
                System.out.println("Exit from booking");
          
        }
           
       } while (choice!=7);

    }
    void addtaxi(){
       System.out.println("--Add Taxi In The System--");
       System.out.println("Enter the Diver name ");
       String drivername=scan.nextLine();
       System.out.println("Enter the Vechicle Number");
       String vechiclenumber=scan.nextLine();
       Random random=new Random();
       int taxiid=100000+random.nextInt(900000);
       Taxi t=new Taxi(taxiid, drivername, vechiclenumber, true);
       taxis.add(t);
       System.out.println("Taxis Added Successfully.....");
       System.out.println("Taxid:"+taxiid);
    }
    void viewtaxi(){
        for(Taxi taxi:taxis){
            System.out.println("TaxiID:"+taxi.getid());
            System.out.println("DriverName:"+taxi.getname());
            System.out.println("VechicleNumber:"+taxi.getno());
            System.out.println("Vechicle Availabe:"+taxi.isAvailable());
        }  
                 }

    void addcustomer(){
            System.out.println("---Customer Details");
            System.out.println("Enter the Name  of the customer ");
            String cname=scan.nextLine();
            System.out.println("Enter the phone number of the customer");
            long phoneno=scan.nextLong();
            Random random=new Random();
            int cid=100000+random.nextInt(900000);

        Customer c=new Customer(cid, cname, phoneno);
        customers.add(c);
        System.out.println("Customer Added Successfully");
        System.out.println("CustomerID: "+cid);  
        }   
        void viewcustomer(){
            for(Customer cust:customers){
                System.out.println("CustomerID: "+cust.getcid());
                System.out.println("CustomerName: "+cust.getcname());
                System.out.println("Customer Phone Number: "+cust.getcno());

            }
          
        }
         void booktaxi() {

    System.out.println("Enter the Customer ID:");
    int cid = scan.nextInt();

    boolean customerfound = false;

    for(int i = 0; i < customers.size(); i++) {
        if(customers.get(i).getcid() == cid) {
            customerfound = true;
            System.out.println("Customer Exists");
            break;
        }
    }

    if(!customerfound) {
        System.out.println("Customer Not found");
        return;
    }

    boolean taxifound = false;
    Taxi selectedTaxi = null;

    for(int i = 0; i < taxis.size(); i++) {

        if(taxis.get(i).isAvailable()) {

            taxifound = true;
            selectedTaxi = taxis.get(i);

            System.out.println("Taxi Available!");
            System.out.println("Taxi ID: " + selectedTaxi.getid());
            System.out.println("Driver: " + selectedTaxi.getname());
            System.out.println("Vehicle: " + selectedTaxi.getno());

            break;
        }
    }

    if(!taxifound) {
        System.out.println("Taxi Not Available!");
        return;
    }

    scan.nextLine();

    System.out.println("Enter the Location to Pick Up:");
    String pickup = scan.nextLine();

    System.out.println("Enter the Location to Drop:");
    String drop = scan.nextLine();

    System.out.println("Enter the distance in KM:");
    double distance = scan.nextDouble();

    double fare = distance * 10;

    System.out.println("Fare: " + fare);

    Random random = new Random();
    int bid = 100000 + random.nextInt(900000);

  Booking b= new Booking(bid, cid,selectedTaxi.getid() , pickup,  drop,  fare);

    bookings.add(b);
    selectedTaxi.setAvailable(false);

    System.out.println("Taxi Successfully Booked!");
    System.out.println("Booking ID: " + bid);
}
void viewbooking(){
    System.out.println("--Booked Taxis List--");
    for(int i=0;i<bookings.size();i++)
    {
        System.out.println("BookingID:"+bookings.get(i).getBookingId());
        System.out.println("CustomerID Booked:"+bookings.get(i).getCustomerId());
        System.out.println("TaxiID Booked:"+bookings.get(i).getTaxiId());
        System.out.println("PickUp Location:"+bookings.get(i).getPickup());
        System.out.println("Drop Location:"+bookings.get(i).getDrop());
        System.out.println("Amount To Travel:"+bookings.get(i).getFare());

    }
}

}