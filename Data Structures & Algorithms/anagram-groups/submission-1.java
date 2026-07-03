class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length >= 1 && strs.length <= 1000){
            for(int i = 0; i < strs.length; i++){
                if(strs[i] == null){
                    continue;
                }
                String s = strs[i].toLowerCase();
                List<String> currentLoop = new  ArrayList<>();
                currentLoop.add(s);
                for(int j = i+1; j < strs.length; j++){
                    if(strs[j] == null){
                        continue;
                    }
                    if(strs[j] != null){
                        String t = strs[j].toLowerCase();
                        if(isAnagram(s,t)){
                            currentLoop.add(t);
                            strs[j] = null;
                        }
                    }

                }
                result.add(currentLoop);
                strs[i] = null;
            }
        };
        return result;
    }

    public boolean isAnagram (String s, String t) {
        char[] wordOne = s.toCharArray();
        char[] wordTwo = t.toCharArray();
        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);

        if(Arrays.equals(wordOne,wordTwo)){
            return true;
        }

        return false;
    }
}
