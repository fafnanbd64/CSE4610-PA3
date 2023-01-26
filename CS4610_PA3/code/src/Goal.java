import java.util.ArrayList;
public class Goal implements ArgumentElement{
    String id;
    String desc;
    ArrayList<AssertedRelationship> relations = new ArrayList<AssertedRelationship>();
    // AssertedRelationship supportedBy[];
    
    public Goal(String id){
        this.id=id;
        this.desc="";
        
        // this.supportedBy = new SupportedBy[0];
    }
    @Override
    public ArrayList<AssertedRelationship> getRelations() {
        // TODO Auto-generated method stub
        return this.relations;
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
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }

}
