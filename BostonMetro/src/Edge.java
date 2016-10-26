public class Edge implements IEdge {
  
	private INode startNode;
	private INode endNode;
	
	@Override
	public INode getNodeA(){
		return this.startNode;
	}
	
	@Override
	public INode getNodeB(){
		return this.endNode;
	}
}
