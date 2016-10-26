import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;


public interface MultiGraphADT {

   public boolean addLine = true;
   
   public boolean addStation = true;

   public boolean searchBFS(INode destination);
	
   public Queue lineHistory(INode destination);
   
   public String getShortestRoute(INode origin, INode destination);
   
   public String generateRoute(Queue lineHistory);
   
   public boolean addLine(int node1, int node2, String label);
   
   public boolean addStation(int id);
   
   public boolean addNode(INode id);
   
   public boolean addEdge(INode node1, INode node2);
   
   public HashMap<INode, IEdge> generateGraph(INode node, IEdge edge);

}
