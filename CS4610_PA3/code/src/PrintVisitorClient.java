import java.util.LinkedList;
import java.util.Queue;

public class PrintVisitorClient {

    public void PrintGSN(Goal g) {
        Print_Visitor v = new PrintVisitorImplementation();
		if (g == null)
			return;

		// Standard level order traversal code
		// using queue
		Queue<ArgumentElement> q = new LinkedList<>(); // Create a queue
		q.add(g); // Enqueue root
		while (!q.isEmpty()) {
			int n = q.size();

			// If this node has children
			while (n > 0) {
				// Dequeue an item from queue
				// and print it
				ArgumentElement p = q.peek();
				q.remove();
				System.out.print(p.accept(v) + " ");

				// Enqueue all children of
				// the dequeued item
				for (int i = 0; i < p.getRelations().size(); i++)
					q.add(p.getRelations().get(i).getChild());
				n--;
			}

			// Print new line between two levels
			System.out.println();
		}

	}
}
