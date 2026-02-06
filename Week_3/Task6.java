class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
        List<int[]> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indices.add(new int[]{heights[i], i});
        }

        indices.sort((a, b) -> b[0] - a[0]);
        
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[indices.get(i)[1]];
        }
        
        return result;
    }
}
