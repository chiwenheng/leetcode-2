package cmcandy.java_language_answers;

/**
 * Created by CHEN on 2020/5/18.
 */
public class _0231 {
    static class Solution {
        public boolean isPowerOfTwo(int n) {
            return Math.log10(n)/Math.log10(2)%1==0;
        }
    }



}
