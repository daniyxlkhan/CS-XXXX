public class p2q2 {
    public static void main(String[] args) {
        String[] words = {"Good", "Luck", "CS1083"};
        allSubsets(words, 0);
    }

    public static void allSubsets(String[] words, int pos) {
        allSubsetsHelper(words, pos, "");
    }
    
    private static void allSubsetsHelper(String[] words, int pos, String currentSubset) {
        // Base case: if we've considered all elements
        if (pos == words.length) {
            // Only print if the subset is not empty
            if (!currentSubset.isEmpty()) {
                System.out.println(currentSubset);
            }
            return;
        }
        
        // Case 1: Do not include words[pos]
        allSubsetsHelper(words, pos + 1, currentSubset);
        
        // Case 2: Include words[pos]
        // Add a space before the next word only if currentSubset is not empty
        String newSubset = currentSubset.isEmpty() ? words[pos] : currentSubset + " " + words[pos];
        allSubsetsHelper(words, pos + 1, newSubset);
    }
    
}
