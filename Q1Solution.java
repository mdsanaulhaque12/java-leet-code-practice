package leetcodejava;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

class Q1Solution {
    public static int[] twoSum(int[] nums, int target) {
        int sum;
        int[] res=new int[2];
        for(int i =0 ;i <nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (j==i) continue;
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums= {2,7,11,15};
        int [] res=twoSum(nums,17);
        for(int a :res){
            System.out.print(a+"  ");
        }
    }
}
