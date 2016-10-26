public class Edge implements IEdge {
  
	private INode node1;
	private INode node2;
	public Edge(INode node1, INode node2){
		this.node1 = node1;
		this.node2 = node2;
	}
	
	@Override
	public INode getNodeA(){
		return node1;
	}
	
	@Override
	public INode getNodeB(){
		return node2;
	}
}
