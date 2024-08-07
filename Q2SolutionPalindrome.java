package leetcodejava;


   /* Given an integer x, return true if x is a palindrome, and false otherwise.
            Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.*/

class Q2SolutionPalindrome {
    public static boolean isPalindrome(int x) {
        int num=0;
        int number=x;
        if(x<0)return false;
        while(number!=0){
            num=num*10+(number%10);
            number=number/10;
        }
        if(num==x)return true;
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}