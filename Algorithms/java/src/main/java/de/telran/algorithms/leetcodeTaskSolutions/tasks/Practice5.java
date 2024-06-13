package de.telran.algorithms.leetcodeTaskSolutions.tasks;

public class Practice5 {
    public static void main(String[] args) {

        String[] words = {"flower","flow","flight"};
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(longestCommonPrefix(words));
    }

    private static int lengthOfLastWord(String s) {

        s = s.trim();
        String[] words = s.split("\\s+");
        String lastWord = words[words.length - 1];

        return lastWord.length();
    }

    private static String longestCommonPrefix(String[] words) {
      if (words == null || words.length == 0){
          return "";
      }
      String prefix = words[0];
      for (int i = 1; i < words.length; i++) {
          while (words[i].indexOf(prefix) != 0){
              prefix = prefix.substring(0, prefix.length() - 1);
              if (prefix.isEmpty()){
                  return "";
              }
          }
      }
      return prefix;
    }
}
