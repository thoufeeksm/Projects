class Taxi {
    private int   taxiid;
    private String drivername;
    private String vechiclenumber;
    private boolean available;
    Taxi(int  taxiid,String drivername,String vechiclenumber,boolean  available){
       this.taxiid=taxiid;
        this.drivername=drivername;
         this.vechiclenumber=vechiclenumber;
         this.available=available;
 }
int  getid(){
    return taxiid;    
 }
 String getname(){
    return  drivername;
 }
 String getno(){
    return  vechiclenumber;
 }
 boolean isAvailable(){
    return available;
    
}
void  setAvailable(boolean available){
   this.available=available;

}
}
