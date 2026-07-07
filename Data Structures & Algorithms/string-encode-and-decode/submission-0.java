class Solution {

    public String encode(List<String> strs) {
        String result = "";
        int key = 17;

        for (String str : strs) {
            char[] chars = str.toCharArray();
            for (Character c : chars) {
                int asciiValue = (int) c + key;
                result = result + asciiValue + "|";
            }
            result = result + ",";

        }
        return result;

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int key = 17;
        char[] chars = str.toCharArray();
        String word = "";
        String temp = "";

        for (Character c : chars) {

            if (c != '|' && c != ',') {
                temp += c;
            }


            if (c == '|') {
                int originalCharCode = Integer.parseInt(temp) - key;
                char originalChar = (char) originalCharCode;
                word += originalChar;
                temp = "";
                continue;
            }

            if (c == ',') {
                result.add(word);
                word = "";
            }

        }

        System.out.println(result);

        return result;
    }
}
