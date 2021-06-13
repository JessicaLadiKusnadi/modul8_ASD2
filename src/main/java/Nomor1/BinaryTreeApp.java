
package Nomor1;


public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        treenode node;
        
        node = new treenode('D');
        tree.insert(node);
        
        node = new treenode('B');
        tree.insert(node);
        
        node = new treenode('A');
        tree.insert(node);
        
        node = new treenode('C');
        tree.insert(node);
        
        node = new treenode('F');
        tree.insert(node);
        
        node = new treenode('E');
        tree.insert(node);
        
        node = new treenode('G');
        tree.insert(node);
        
        System.out.print("Traversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
    }
    
}
    

