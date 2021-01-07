class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        
        String commPrefix = strs[0];
              
        for (int i = 1; i < strs.length; i++){
             while(strs[i].indexOf(commPrefix) != 0) {
                commPrefix = commPrefix.substring(0, commPrefix.length() - 1);
                 if (commPrefix.isEmpty()) {
                     return "";
                 }
            }
        }
            return commPrefix;
    }
}
