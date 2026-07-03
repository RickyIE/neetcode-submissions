class Solution {
    public boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();

        if(!s.isEmpty() && t.length() <= 5 * 10000 ){

            char[] wordOne = s.toCharArray();
            char[] wordTwo = t.toCharArray();

            Arrays.sort(wordOne);
            Arrays.sort(wordTwo);

            if(Arrays.equals(wordOne, wordTwo)){
                System.out.println("true");
                return true;
            }

        }

        System.out.println("false");
        return false;
    }
}
