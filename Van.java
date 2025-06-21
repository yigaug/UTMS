
package TheElites;

public class Van extends Vehicle{
    
    public Van(String regNumber, String vehicleType,  String shiftTime){
         super(regNumber, vehicleType,shiftTime);
     }
    
     @Override
    public void makeSerivce(){  
        System.out.println("Van  with regNumber | "+ getregNumber()+ "  is out of service");
    }
       
     @Override
    public void trackVehicle(){  
        System.out.println("Van  "+ getvehicleType() + " with  regNumber | "+getregNumber()+"  Has been tracked");
    }
       
     @Override
    public void scheduleVehicle(){  
        System.out.println("Van  with regNumber | "+ getregNumber()+ " Cannot be Scheduled!");
    }      
}
