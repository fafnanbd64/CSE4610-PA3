import java.util.ArrayList;

public interface ArgumentElement {
   public ArrayList<AssertedRelationship> getRelations();
    public String accept(Print_Visitor visitor);
    public String getId();
    // public void delete_node(GSN_Visitor visitor);
    // public void delete_relation(GSN_Visitor visitor);
    // public void modify_relation(GSN_Visitor visitor);
    // public void modify_node_content(GSN_Visitor visitor);

}

