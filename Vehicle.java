


package TheElites;

 public abstract class Vehicle {
    final private String regNumber;
    final private String vehicleType;
    final private String shiftTime;
            
    
        public Vehicle(String regNumber, String vehicleType,  String shiftTime){
        this.regNumber=regNumber;
        this.vehicleType =vehicleType;
        this.shiftTime=shiftTime;
    }
        
   // accesing the private data
    
    public String getregNumber(){
    return regNumber;
    }
    
    public String getvehicleType(){
    return vehicleType;
    }
    
    public String getshiftTime(){
    return shiftTime;
    }
    
    // Overriding interfaces
    public  abstract void makeSerivce();
    public abstract void trackVehicle();
    public abstract void scheduleVehicle();
}
  

 
    

