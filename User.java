


package TheElites;

// the abstarct super class to be extended by other subclasses (Student, Lecturer, TransportOfficer)

abstract class User {
    final private String userID;
    final private String userName;
    
    // Craeting a constractor that sets up a new user  with userID and userName.
    
    public User(String userID, String userName){
        this.userID =userID;
        this.userName =userName;       
    }
    
    /*application of encapsulation.
    Accessig the private data through getter methods
    */
    
    
    public String getuserID(){
        return userID;
        
    }
    
    public String getuserName(){
        return userName;
        
    }

/*The method to be implemented by all the subclasses
subclasses must provide their own version of this method
    through @Overriding*/

 abstract void requestTransport();



}
