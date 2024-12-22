package otheralgorithms;

class Solution {
    static int maxLen = 0;
    static int lo = 0;

    public static void main(String[] args) {
        System.out.println(longestPalindromeFinder("banab"));
    }
    public static String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        if(s.length() < 2) {
            return s;
        }

        for(int i = 0; i<input.length; i++) {
            expandPalindrome(input, i, i);
            expandPalindrome(input, i, i+1);
        }
        return s.substring(lo, lo+maxLen);

    }

    public static void expandPalindrome(char[] s, int j, int k) {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if(maxLen < k - j - 1) {
            maxLen = k - j - 1;
            lo = j+1;
        }
    }
    //Maxlenght without repeading the characters
    public static int longestPalindromeFinder(String str) {
        int maxlenght =0;
        int left =0;
        for(int right=0;right<str.length();right++) {
          int indexOfStrings = str.indexOf(str.charAt(right),left);
          if(indexOfStrings != right) {
              left = indexOfStrings +1;
          }
          maxlenght = Math.max(maxlenght,right-left+1);
        }

        return maxlenght;
    }
}
