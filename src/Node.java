public class Node{

    // Node Class


    private Node left;
    private Node right;
    private int data;

    // Getting and Setting Left Node


    public Node(int data){
        this.data=data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    // Getting and Setting Right Node


    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}