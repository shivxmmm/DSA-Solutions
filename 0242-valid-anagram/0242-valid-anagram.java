class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr= s.toCharArray(); // method to convert string into array
        char[] arr2= t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(Arrays.equals(arr,arr2)){ // this method compares two arrays
            return true;
        }
        return false;
 
    }
}