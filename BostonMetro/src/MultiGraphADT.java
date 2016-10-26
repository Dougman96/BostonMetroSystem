import java.util.List;

public interface MultiGraphADT {

	boolean addNode(INode id);

	boolean addEdge(INode node1, INode node2);

	List<INode> searchBFS(INode start, INode end);

}
