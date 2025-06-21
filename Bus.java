


package TheElites;

 class Bus extends Vehicle{
     public Bus(String regNumber, String vehicleType,  String shiftTime){
         super(regNumber, vehicleType,shiftTime);
     }

    
     @Override
    public void makeSerivce(){  
        System.out.println("The bus  with regNumber | "+ getregNumber() + "  is in service");
    }
       
     @Override
    public void trackVehicle(){  
        System.out.println("The bus  with regNumber | " +getregNumber()+ "  Cannot be tracked!!");
    }
       
     @Override
    public void scheduleVehicle(){  
        System.out.println("The vehicle "+  getvehicleType()+" will be sheduled at | "  +getshiftTime());
    }
    
    
}
