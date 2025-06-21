
package TheElites;

class Lecturer extends User {
    final private String Department;
    public Lecturer(String userID, String userName, String Department ){
        super(userID, userName);
        this.Department=Department;
        
    }
    @Override
            public void requestTransport(){
            System.out.println("Lecturer  " +getuserID() + "  Under  "  +Department+  "   has requested transport ");
            }
  
    }
    

