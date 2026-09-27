class Booking {

    private int bookingid;
    private int customerid;
    private int taxiid;
    private String pickup;
    private String drop;
    private double fare;

    Booking(int bookingid, int customerid,int  taxiid, String pickup, String drop, double fare) {

        this.bookingid = bookingid;
        this.customerid = customerid;
        this.taxiid = taxiid;
        this.pickup = pickup;
        this.drop = drop;
        this.fare = fare;
    }
    int getBookingId() {
    return bookingid;
}
int getCustomerId() {
    return customerid;
}

int  getTaxiId() {
    return taxiid;
}

String getPickup() {
    return pickup;
}

String getDrop() {
    return drop;
}

double getFare() {
    return fare;
}
}