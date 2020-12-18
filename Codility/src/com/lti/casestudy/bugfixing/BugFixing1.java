package com.lti.casestudy.bugfixing;

public class BugFixing1 {
	String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }
        char best_char = 'a';
        int best_res = 0;
        for (int i = 0; i < 26; i++) {//corrected
            if (occurrences[i] > best_res) {//corrected
                best_char = (char) ((int) 'a' + i);
                best_res = occurrences[i];
            }
        }
        return Character.toString(best_char);
    }
    
    
    public static void main(String[] args) {
        //System.out.println(new BugFixing1().solution("apple"));
    	System.out.println(new BugFixing1().solution("hello"));
    	System.out.println(new BugFixing1().solution("parameter"));
    	
    }
}
