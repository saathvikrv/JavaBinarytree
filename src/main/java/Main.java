// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayDeque;
import java.util.Deque;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hi");

    BinaryTree myTree = new BinaryTree();
    myTree.addRoot(7);
    myTree.addNode(myTree.root, 0, 3);
    myTree.addNode(myTree.root, 1, 1);
    myTree.addNode(myTree.root.lChild, 0, 4);
    myTree.addNode(myTree.root.lChild, 1, 5);
    myTree.addNode(myTree.root.rChild, 0, 2);
    myTree.addNode(myTree.root.rChild, 1, 9);
    myTree.print_levelOrder(myTree);
  }
}