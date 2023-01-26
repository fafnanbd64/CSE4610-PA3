import java.util.ArrayList;

public class Context implements ArgumentElement {
    String id;
    String desc;
    ArrayList<AssertedRelationship> relations = new ArrayList<AssertedRelationship>();

    public Context(String id) {
        this.id=id;
        this.desc = "";
    }
    public void addDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public ArrayList<AssertedRelationship> getRelations() {
        // TODO Auto-generated method stub
        return this.relations;
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
