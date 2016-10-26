import java.util.List;

public class Boston {
	
	MultiGraphADT mg = new MultiGraph();
	
   
   public boolean addStation(INode node){
	   return mg.addNode(node);
   }
   public boolean addTrack(INode node1, INode node2){
	   return mg.addEdge(node1, node2);
   }
   
   public List<INode> findPath(INode start, INode end){
	   return mg.searchBFS(start, end);
   }
  
}