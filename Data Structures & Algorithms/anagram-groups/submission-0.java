class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to group words by their sorted version
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // 1. Convert word to characters and sort them
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars); // This is our group key

            // 2. If the key doesn't exist in the map, create a new list for it
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // 3. Add the original word to its matching anagram group
            map.get(sortedWord).add(word);
        }

        // 4. Return all the groups as a list of lists
        return new ArrayList<>(map.values());
    }
}
