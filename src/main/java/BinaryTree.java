public class BinaryTree{
  TreeNode root = null;

  void addRoot(int val){
    root = new TreeNode();
    root.setVal(val);
  }

  void addNode(TreeNode loc, int child, int val){
    TreeNode node = new TreeNode();
    node.setVal(val);
    if(child == 0){
      loc.setRChild(node);
    } else if(child == 1){
      loc.setLChild(node);
    }
  }
  void print_depthFirst(BinaryTree tree){
    tree.root.print_depthFirstFromNode(tree.root);
  }

  void print_levelOrder(BinaryTree tree){
    tree.root.print_levelOrderFromNode(tree.root);
  }
}