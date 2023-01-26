import java.util.LinkedList;
import java.util.Queue;

public class GSN_Model{

    Goal root;
    public GSN_Model() {
        this.root = null;
    }
    public Goal create_Goal(String node_id) {
        // TODO Auto-generated method stub
        Goal g = new Goal(node_id);
        
        return g;
    }

  
    public Assumption create_Assumption(String node_id) {
        // TODO Auto-generated method stub
        Assumption a = new Assumption(node_id);
        return a;
    }

    
    public Justification create_Justification(String node_id) {
        // TODO Auto-generated method stub
        Justification j = new Justification(node_id);

        return j;
    }

    public Solution create_Solution(String node_id) {
        // TODO Auto-generated method stub
        Solution s = new Solution(node_id);

        return s;
    }

    public Context create_Context(String node_id) {
        // TODO Auto-generated method stub
        Context c = new Context(node_id);

        return c;
    }

    public Strategy create_Strategy(String node_id) {
        // TODO Auto-generated method stub
        Strategy s = new Strategy(node_id);
        return s;
    }

    
    public void create_InContextOf(ArgumentElement child, Goal parent ) {
        // TODO Auto-generated method stub
        InContextOf contextRelation = new InContextOf(parent, child);
        parent.relations.add(contextRelation);
       
    }
    public  void  create_InContextOf(ArgumentElement child, Strategy parent ) {
        // TODO Auto-generated method stub
        InContextOf contextRelation = new InContextOf(parent, child);
        parent.relations.add(contextRelation);
        
    }


    public void create_SupportedBy(ArgumentElement child, Goal parent) {
        // TODO Auto-generated method stub
        SupportedBy supportRelation = new SupportedBy(parent, child);
        parent.relations.add(supportRelation);
        
    }
    public void create_SupportedBy(ArgumentElement child, Strategy parent) {
        // TODO Auto-generated method stub
        SupportedBy supportRelation = new SupportedBy(parent, child);
        parent.relations.add(supportRelation);
        SupportedBy SR = new SupportedBy(parent, child);
        parent.relations.add(SR);
    }

    public boolean delete_node(String node_id) {
        
        
		Queue<ArgumentElement> q = new LinkedList<>(); // Create a queue
		q.add(root); // Enqueue root
		while (!q.isEmpty()) {
			int n = q.size();

			// If this node has children
			while (n > 0) {
				// Dequeue an item from queue
				// and print it
				ArgumentElement p = q.peek();
				q.remove();
                for(int j=0; j < p.getRelations().size(); j++){
                    if(p.getRelations().get(j).getChild().getId()==node_id) {
                        p.getRelations().remove(j);
                    }
                }

                
				// Enqueue all children of
				// the dequeued item
				for (int i = 0; i < p.getRelations().size(); i++)
					q.add(p.getRelations().get(i).getChild());
				n--;
			}

			// Print new line between two levels
			System.out.println();
		}
        return false;
    }

    
    public boolean delete_relation() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean modify_node_content() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean modify_relation() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
