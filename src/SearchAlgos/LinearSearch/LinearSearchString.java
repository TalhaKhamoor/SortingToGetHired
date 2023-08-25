package SearchAlgos.LinearSearch;

/**
 * Linear Search String Class with main method that initializes a string and a target char.
 * Main method calls the search method which takes the two arguments are returns boolean true if target element found.
 */
public class LinearSearchString {
    public static void main(String[] args) {
        String name = "Talha";
        char target = 'l';
        boolean isTargetFound = search(name, target);
        System.out.println("Target '" + target + "' was found in string '" + name + "' : " + isTargetFound);
    }

    public static boolean search(String str, char target) {
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
