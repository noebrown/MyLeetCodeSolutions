class Solution {
    public boolean isPalindrome(int x) {
        String origNum = Integer.toString(x);
        String backwards = "";
        
        if(origNum.startsWith("-")){
            return false;
        }
        
        for(int i = origNum.length()-1; i >= 0; i--){   
            backwards += origNum.charAt(i);
        }
        
        System.out.println(backwards);
        System.out.println(origNum);
        
        if(backwards.equals(origNum)) {
            return true;
        } else {
            return false;
        }               
    }
}
