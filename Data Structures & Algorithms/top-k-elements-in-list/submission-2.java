class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Arrays.sort(nums);
        Map<Integer, Integer> map = new TreeMap<>();

        for(int a: nums){
            if(nums.length > 1){
                if(map.containsKey(a)){
                    int newKey = map.get(a) + 1;
                    map.replace(a, newKey);
                }else {
                    map.put(a, 1);
                }

            }else{
                map.put(a,1);
                break;
            }
        }

        System.out.println(map);

        for(int i =0; i<result.length; i++){
            int element = Integer.MIN_VALUE;
            int frequency = Integer.MIN_VALUE;
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() > frequency){
                    element = entry.getKey();
                    frequency = entry.getValue();
                };
            }
            result[i] = element;
            map.remove(element);
        }


        System.out.println(Arrays.toString(result));
        return  result;
    };
}
