import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        postOrder(res,root);
        return res;

    }

    public void postOrder(ArrayList<Integer> list,TreeNode node){
        if(node == null)
            return;
        postOrder(list,node.left);
        postOrder(list,node.right);

        list.add(node.val);
    }

}
