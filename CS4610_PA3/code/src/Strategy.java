import java.util.ArrayList;

public class Strategy implements ArgumentElement {
    String id;
    String desc;
    ArrayList<AssertedRelationship> relations = new ArrayList<AssertedRelationship>();

    // AssertedRelationship supportedBy[];
    
    
    public Strategy(String id){
        this.id=id;
        this.desc="";
       
        // this.supportedBy = new SupportedBy[0];
    }
    public void addDesc(String desc) {
        this.desc = desc;
    }
    

    @Override
    public String accept(Print_Visitor visitor) {
        // TODO Auto-generated method stub
        return visitor.print(this);
    }
    @Override
    public ArrayList<AssertedRelationship> getRelations() {
        // TODO Auto-generated method stub
        return this.relations;
    }
    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }

    
}
