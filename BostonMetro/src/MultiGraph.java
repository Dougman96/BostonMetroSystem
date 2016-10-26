import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MultiGraph implements MultiGraphADT{
	
	private List<INode> nodes = null;
	private List<List<INode>> linesList = null; 
	private Set<INode> visited = null;
	private Queue<INode> paths = null;
	
	private Map<INode, Collection<Edge>> map = new HashMap<>();
	private List<IEdge> edges = new ArrayList<>();
	
	public IEdge getEdge() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<INode> findChildren(INode currentNode) {
		List<INode> children = new ArrayList<>();
		for(IEdge edge: map.get(currentNode)){
			children.add(edge.getNodeB());
		}
		return children;
		
	}
	
	public List<IEdge> getGraph(){
		
		return edges;
	}

	@Override
	public boolean searchBFS(INode destination) {
		List<INode> lastLine = linesList.get(linesList.size() - 1);
		   List<INode> newLine = new ArrayList<>();
		   
		   for(INode currentNode :lastLine){
			   if(currentNode.equals(destination)){
				   return true;
			   }
			   else{
				   for(INode Node : findChildren(currentNode)){
					   if(Node.equals(destination)){
						   newLine.add(Node);
						   return true;
					   }
					   else if(!visited.contains(Node)){
						   visited.add(Node);
						   newLine.add(Node);
					   }
				   }
			   }
		   }
		   																//If newLine has unvisited nodes we now add it to the list of lines(Recursive)
		   if(!newLine.isEmpty()){
			   linesList.add(newLine);
			   searchBFS(destination);
		   }
		   return false;
		   
	   }
	@Override
	public Queue lineHistory(INode destination) {
																		//Use queue to hold the required route
		Queue<INode> queue = new LinkedList<>();

			queue.add(destination);

			for(int i = linesList.size() - 1; i>= 0; i--){
				line = linesList.get(i);
				INode last = (INode)queue.peek();

				for(INode n : line){							//For each node(s) in that line
					if(map.isConnected(last, n)){			//Checks if the nodes are connected
						queue.add(n);
						Edge e = map.haveEdge(last, n);
						paths.add(e.getLabel());
						break;								//Exits the loop early
					}
				}
			}
return queue;									//Returns the route taken
}
	@Override
	public String getShortestRoute(INode origin, INode destination) {
		
		List<List<INode>> startingLine = new ArrayList<List<INode>>();
		startingLine.add((List<INode>) origin);
		linesList.addAll(startingLine);
		visited.add(origin);
		boolean found = searchBFS(destination); 
		
		assert false : found;										//Assertions
		assert false : searchBFS(destination);
		
		String temp = "";
		if(found == true){
																	//traverse back in your lines list
			temp = generateRoute(lineHistory(destination));
		}
		return temp;
}

	@Override
	public String generateRoute(Queue lineHistory) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public boolean addEdge(INode node1, INode node2) {
		
			edges.addEdge(node1, node2); 
			return true;
	}

	@Override
	public boolean addNode(INode id) {
		
			nodes.addNode(id);
			return true;

	}
	
	public void generateGraph(INode node, List edges){
		map.put(node, edges);
		System.out.println("Graph Generated");
	}

	@Override
	public boolean addLine(int node1, int node2, String label) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addStation(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashMap<INode, IEdge> generateGraph(INode node, IEdge edge) {
		// TODO Auto-generated method stub
		return null;
	}
}
