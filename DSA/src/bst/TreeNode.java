package bst;

public class TreeNode {
	
	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private boolean isDeleted;
	
	public TreeNode(Integer data) {
		this.data = data;
	}

	public Integer getData() {
		return data;
	}
	
	public TreeNode getLeftChild() {
		return leftChild;
	}
	
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	
	public TreeNode getRightChild() {
		return rightChild;
	}
	
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public TreeNode find(Integer data) {
		
		if(this.data == data && !isDeleted) return this;
		
		if(leftChild != null && data < this.data) return leftChild.find(data);
		
		if(rightChild != null) return rightChild.find(data);
		
		return null;
	}
	
	public void insert(Integer data) {
		if(data >= this.data) {
			if(this.rightChild == null) this.rightChild = new TreeNode(data);
			else this.rightChild.insert(data);
		} else {
			if(this.leftChild == null) this.leftChild = new TreeNode(data);
			else this.leftChild.insert(data);
		}
	}
	
	public void delete() {
		this.isDeleted = true;
	}
	
	public boolean isDeleted() {
		return this.isDeleted;
	}
	
	public Integer smallest() {
		if(this.leftChild == null) return this.data;
		return this.leftChild.smallest();
	}
	
	public Integer largest() {
		if(this.rightChild == null) return this.data;
		return this.rightChild.largest();
	}

}
