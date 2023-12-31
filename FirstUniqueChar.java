/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
a. 1 <= s.length <= 10^5
b. s consists of only lowercase English letters
*/


import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Find the first character with count 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "leetcode";
        System.out.println(firstUniqChar(s1));  // Output: 0

        // Example 2
        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2));  // Output: 2

        // Example 3
        String s3 = "aabb";
        System.out.println(firstUniqChar(s3));  // Output: -1
    }
}
