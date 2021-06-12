package bst;

public class BinarySearchTree {
	
	private TreeNode root;
	
	public void insert(Integer data) {
		if(root == null) this.root = new TreeNode(data);
		else root.insert(data);
	}
	
	public TreeNode find(Integer data) {
		if(root != null) return root.find(data);
		
		return null;
	}
	
	//Soft deletion of the node
	public void delete(Integer data) {
		TreeNode toDel = find(data);
		toDel.delete();
	}
	
	
	//This is a lengthy and tedious way of doing it. But it's a correct way
	/*
	public void delete(Integer data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		
		if(current == null) return;
		
		while(current != null && current.getData() != data) {
			parent = current;
			
			if(data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		
		if(current == null) return;
		
		if(current.getLeftChild() == null && current.getRightChild() == null) {
			if(current == root) root = null;
			else {
				if(isLeftChild) parent.setLeftChild(null);
				else parent.setRightChild(null);
			}
		} else if(current.getRightChild() == null) {
			if(current == root) root = current.getLeftChild();
			else if(isLeftChild) parent.setLeftChild(current.getLeftChild());
			else parent.setRightChild(current.getLeftChild());
		} else if(current.getLeftChild() == null) {
			if(current == root) root = current.getRightChild();
			else if(isLeftChild) parent.setLeftChild(current.getRightChild());
			else parent.setRightChild(current.getRightChild());
		}
		else {
			//Third case where deleted node has both right and left child
			
			 //In this case: -
			 //We get the successor of the node to replace the current node
			 //Set the right child, if any, of the successor to the left child of the parent of the successor
			 
		}
	}
	*/
	
	public Integer smallest() {
		if(this.root != null) return root.smallest();
		return null;
	}
	
	public Integer largest() {
		if(this.root != null) return root.largest();
		return null;
	}

}
