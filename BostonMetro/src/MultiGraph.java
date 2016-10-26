import java.util.ArrayList;
import java.util.List;

public class MultiGraph implements MultiGraphADT {

	private List<INode> nodes;
	private List<IEdge> edges;

	public MultiGraph() {
		nodes = new ArrayList<>();
		edges = new ArrayList<>();
	}

	@Override
	public List<INode> searchBFS(INode start, INode end) {
		return null;
	}

	@Override
	public boolean addEdge(INode node1, INode node2) {
		return edges.add(new Edge(node1, node2));
	}

	@Override
	public boolean addNode(INode node) {
		return nodes.add(node);
	}
}
