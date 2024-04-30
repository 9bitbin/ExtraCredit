
import java.util.*;

public class AnagramSorter {
    /**
     * Name: Himal Shrestha
     * Class: CSC 229 : Data Structures & Algorithms
     * Extra credit assignment problem one
     * Professor: Moath Alrajab
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a hashmap to store sorted strings as keys and their corresponding anagrams as values
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string to a character array, sort it, and convert it back to a string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);

            // If the sorted string is already present in the map, add the original string to its corresponding list
            // Otherwise, create a new entry in the map with the sorted string as key and a new list containing the original string as value
            map.computeIfAbsent(sortedStr, key -> new ArrayList<>()).add(str);
        }

        // Return the values (lists of anagrams) of the map as a list
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        // Test the function with an array of strings
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        // Display the grouped anagrams
        for (List<String> group : result) {
            System.out.println(group); //print the group.
        }
    }
}
