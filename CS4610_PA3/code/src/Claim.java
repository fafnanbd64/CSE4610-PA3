import java.util.ArrayList;

public class Claim implements ArgumentElement {
    String id;
    String desc;

    public boolean assumed;
    public boolean toBeSupported;
    
  
    @Override
    public String accept(Print_Visitor visitor) {
        return desc;
        // TODO Auto-generated method stub
        
    }


    @Override
    public ArrayList<AssertedRelationship> getRelations() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }
   
   

    
}
