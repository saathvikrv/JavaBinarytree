import java.util.ArrayDeque;
import java.util.Deque;


public class TreeNode{
  TreeNode lChild = null;
  TreeNode rChild = null;
  int val;

  void setVal(int num){
    val = num;
  }

  void setRChild(TreeNode node){
    rChild= node;
  }

  void setLChild(TreeNode node){
    lChild = node;
  }
  
  void print_depthFirstFromNode(TreeNode rootNode){
    
    if(rootNode != null){
      if(rootNode.lChild != null){
        rootNode.lChild.print_depthFirstFromNode(rootNode.lChild);
      }
      if(rootNode.rChild != null){
        rootNode.rChild.print_depthFirstFromNode(rootNode.rChild);
      }
      System.out.println(rootNode.val);
    }
  }void print_levelOrderFromNode(TreeNode rootNode){
    Deque<TreeNode> wrk = new ArrayDeque<TreeNode>();
    wrk.addLast(rootNode);
    while(wrk.size() > 0){
      TreeNode toDoNode = wrk.removeFirst();
      System.out.print(toDoNode.val + ", ");
      if(toDoNode.lChild != null){
        wrk.addLast(toDoNode.lChild);
      }    
      if(toDoNode.rChild != null){
        wrk.addLast(toDoNode.rChild);
      }
    }
  }
}
  /*int[][] getBelowTree(){
    if(lChild==null && rChild==null){
      
      int[][] retList = new int[][]{new int[]{val}};
      
    }else if(lChild==null) {
      
      int[][] retList = new int[][]{new int[]{val}, lChild.getBelowTree()};
      
    }else if(rChild==null) {
      
      int[][] retList = new int[][]{new int[]{val}, rChild.getBelowTree()};
      
    }else{
      
      int[][] retList = new int[][]{new int[]{val}, rChild.getBelowTree(), lChild.getBelowTree()};
      
    }
    return retlist;
  }

  int getVal(){
    return val;
  } 
}*/
