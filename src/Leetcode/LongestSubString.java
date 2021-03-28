package Leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestSubString {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("abc"));
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(!s.equals("")) {
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.append(stringBuilder.charAt(0));
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 0; i < stringBuilder.length(); i++) {

                for (int j = i + 1; j < stringBuilder.length(); j++) {

                    if (check(stringBuilder.substring(i, j))) {

                        treeSet.add((stringBuilder.substring(i, j)).length());

                    }
                }
            }
            return treeSet.last();
        }
        return 0;
    }

    private boolean check(String s){
        Set<Character> characterSet = new HashSet<>();
        for(Character c : s.toCharArray()){
            characterSet.add(c);
        }
        if(characterSet.size()==s.length()){
            return true;
        }else{
            return false;
        }
    }
}