import java.lang.*;
import java.util.*;
    
class Solution {
    public int reverse(int x) {
        String intialNum = Integer.toString(x);
        String stringSolution = "";
        
        if(intialNum.startsWith("-")) {
            intialNum = intialNum.substring(1,intialNum.length());
            stringSolution += "-";   
        } 
      
        for(int i = intialNum.length()-1; i >= 0; i--){   
            stringSolution += intialNum.charAt(i);
        }
        
        return Integer.valueOf(stringSolution);       
    }
}
