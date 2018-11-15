// Bhushan Patel 683399

public class SBinaryTree {

    //Main Function


    public static void main(String[] args) {

        System.out.println("Serialization of 100, 900, 200, 400, 300, 600 (Binary Tree)\n\n");
        Node rootNode=null;

        // Designing Binary Tree
        // Adding Nodes


        rootNode  = addNode(rootNode, 100, true);
        rootNode  = addNode(rootNode, 900, true);
        rootNode  = addNode(rootNode, 200, true);
        rootNode  = addNode(rootNode, 400, true);
        rootNode  = addNode(rootNode, 300, true);
        rootNode  = addNode(rootNode, 600, true);


        //  Printing OutPut


        String str = serializeBinaryTree(rootNode, "");
        System.out.println(str);


    }

    //  Serializing Binary Tree


    private static String serializeBinaryTree(Node rootNode, String str){
        if(rootNode == null){
            return "null,";
        }

        StringBuilder sb  = new StringBuilder();
        sb.append(rootNode.getData());
        sb.append(",");

        sb.append(serializeBinaryTree(rootNode.getLeft(), str));
        sb.append(serializeBinaryTree(rootNode.getRight(), str));
        return sb.toString();
    }



    // Node


    private static Node addNode(Node rootNode, int i, boolean isRootNode) {
        if(rootNode==null){
            return new Node(i);
        }else{
            if(i > rootNode.getData()){
                if(isRootNode){
                    Node nodeToAdd = addNode(rootNode.getRight(), i, isRootNode);
                    rootNode.setRight(nodeToAdd);
                }else{
                    Node nodeToAdd = addNode(rootNode.getLeft(), i, isRootNode);
                    rootNode.setLeft(nodeToAdd);
                }

            }else{
                if(isRootNode){
                    Node nodeToAdd = addNode(rootNode.getLeft(), i, isRootNode);
                    rootNode.setLeft(nodeToAdd);
                }else{
                    Node nodeToAdd = addNode(rootNode.getRight(), i, isRootNode);
                    rootNode.setRight(nodeToAdd);
                }
            }
        }

        // Returning Root Node


        return rootNode;
    }

}