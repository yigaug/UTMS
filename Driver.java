
package TheElites;


public class Driver  extends User{
   final  private String licenseNumber;
    public Driver(String userID, String userName, String licenseNumber){
        super(userID, userName);
        this.licenseNumber =licenseNumber;
        
    }
    public String getlicenseNumber(){
        return licenseNumber;
    }

    @Override
            public void requestTransport(){
            System.out.println("Driver  "+ getuserID()+"  has requested Transport: |  " +"Lisence:" +licenseNumber );
            }
      
    
}
