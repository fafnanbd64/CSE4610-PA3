import java.util.ArrayList;

public class InContextOf implements AssertedRelationship {
    ArgumentElement parent;
    ArgumentElement child;
   
    public InContextOf(ArgumentElement parent,ArgumentElement child) {
        this.parent = parent;
        this.child = child;
    }
    @Override
    public String accept(Print_Visitor visitor) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public ArrayList<AssertedRelationship> getRelations() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public ArgumentElement getChild() {
        // TODO Auto-generated method stub
        return child;
    }
    @Override
    public ArgumentElement getParent() {
        // TODO Auto-generated method stub
        return parent;
    }
    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
