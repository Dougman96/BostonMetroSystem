public class Node implements INode {
	private int nodeID;

	public Node(int nodeID) {
		this.nodeID = nodeID;
	}

	@Override
	public int getId() {
		return nodeID;
	}

}