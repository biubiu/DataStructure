package com.lintcode;

/**
 * Created by shawncao on 9/25/15.
 */
public class StrUtils {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public static int strStr(String source, String target) {
        if (source == null || target == null){
            return -1;
        }

        int i,j;
        for (i = 0; i < source.length() - target.length() + 1; i++){
            for (j = 0; j < target.length(); j++){
                if (source.charAt(i+j) != target.charAt(j)){
                    break;
                }
            }

            if(j == target.length()){
                return i;
            }
        }
        return -1;
    }
}
