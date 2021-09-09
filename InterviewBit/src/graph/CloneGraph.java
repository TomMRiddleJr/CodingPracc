package graph;

import java.util.*;

class UndirectedGraphNode {
	int label;
	List<UndirectedGraphNode> neighbors;

	UndirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
};

public class CloneGraph {
	
/*
 * 	My solution
 * 
	static Set<Integer> v;

	static UndirectedGraphNode helper(UndirectedGraphNode node) {
		if (node == null)
			return null;
		if (v.contains(node.label))
			return node;
		UndirectedGraphNode n = new UndirectedGraphNode(node.label);
		v.add(n.label);
		for (UndirectedGraphNode i : node.neighbors) {
			if (v.contains(i.label)) {
				n.neighbors.add(i);
			} else {
				UndirectedGraphNode neigh = helper(i);
				if (neigh != null)
					n.neighbors.add(neigh);
			}
		}

		return n;
	}

	public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		v = new HashSet<>();
		return helper(node);
	}
	
	*/
	
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<Integer, UndirectedGraphNode> labelsVisited = new HashMap<Integer, UndirectedGraphNode>();
        return cloneGraph(node, labelsVisited);
    }
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node, HashMap<Integer, UndirectedGraphNode> labelsVisited) {
        if(labelsVisited.containsKey(node.label)){
            return labelsVisited.get(node.label);
        }
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        labelsVisited.put(newNode.label,newNode);
        for(UndirectedGraphNode each : node.neighbors){
            newNode.neighbors.add(cloneGraph(each, labelsVisited));
        }
        return newNode;
    }

}
