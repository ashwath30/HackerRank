public class Solution {
    public static int numberNeeded(String first, String second) {
        int count = 0;
        int[] freq = new int[26];
        for (char c : first.toCharArray()) 
            freq[c - 'a']++; //integer corresponding to that particular char.
        for (char c : second.toCharArray()) 
            freq[c - 'a']--;
        for (int i : freq) 
            count += Math.abs(i);
        return count;
        
       }

//https://bournetocode.com/projects/GCSE_Computing_Fundamentals/pages/3-3-5-ascii.html
