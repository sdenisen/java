package com.company;

import com.sun.source.tree.Tree;

public class Solution {
    TreeNode root;
    public Solution(){
    }

    private void convertThreeNode(){


    }

    public TreeNode sortedArrayToBST(int []nums){
        var middle = nums.length/2;
        System.out.format("length: %s\n", nums.length);
        System.out.format("middle: %s\n", middle);

        TreeNode root = new TreeNode(nums[middle]);

        var middle_level_1 = middle/2;
        var left_root_level_1 = nums[middle_level_1];
        var right_root_level_1 = nums[middle + middle_level_1];
        root.left = new TreeNode(left_root_level_1);
        root.right = new TreeNode(right_root_level_1);

        var middle_level_2 = middle_level_1/2;






        if (nums.length % 2 == 0){
            System.out.println("entered number is even");
        }
        else {
            System.out.println("entered number is odd");
        }
        return new TreeNode();
    }
}
