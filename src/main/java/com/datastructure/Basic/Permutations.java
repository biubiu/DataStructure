package com.datastructure.Basic;

/**
 * User: Shawn cao
 * Date: 14-6-8
 * Time: PM10:26
 */
public class Permutations {

        public void permute(String value, int startIndex, int endIndex) {

            if (startIndex == endIndex) {
                System.out.printf("%s\n", value);
            } else {
                for (int currIndex = startIndex; currIndex <= endIndex; currIndex++) {

                    value = swap(value, startIndex, currIndex);
                    permute(value, startIndex + 1, endIndex);
                    value = swap(value, startIndex, currIndex);
                }
            }
        }

        private String swap(String value, int idxOne, int idxTwo) {
            char[] charArray = value.toCharArray();
            char temp = value.charAt(idxOne);
            charArray[idxOne] = charArray[idxTwo];
            charArray[idxTwo] = temp;
            return new String(charArray);

        }

}
