class Solution {
    public List<Integer> largestValues(TreeNode root) {
          // queue for BFS
          // size to iterate a level altogether
          List<Integer> ans = new ArrayList<>();
         // return an empty list if there are no nodes in the tree
          if(root==null)
          return ans;

          Queue<TreeNode> q = new LinkedList<>();
          q.add(root);
          while(!q.isEmpty()){
            int size = q.size();
            int max = Integer.MIN_VALUE;
         // iterate over all the nodes of the same level at once
         for(int i=0; i<size; i++){
            TreeNode curr = q.remove();
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);

            // update max for each node in a level
                max = Math.max(max, curr.val);



         }
          // add the maximum value of each level into the answer list
            ans.add(max);

          }
          return ans;


    }
}
