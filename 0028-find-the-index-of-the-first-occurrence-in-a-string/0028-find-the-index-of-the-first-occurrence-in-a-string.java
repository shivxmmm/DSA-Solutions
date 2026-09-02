class Solution {
    public int strStr(String haystack, String needle) {

        int heylen = haystack.length();
        int needlen = needle.length();

        if(heylen < needlen){
            return -1;
        }

        for(int i = 0; i <= heylen - needlen; i++){
            int j = 0;
            while(j < needlen && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
            }
            if(j == needlen){
                return i;
            }
        }
        return -1;
    }
}