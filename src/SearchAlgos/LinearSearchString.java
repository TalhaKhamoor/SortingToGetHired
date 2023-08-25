package SearchAlgos;

public class LinearSearchString {
    public static void main(String[] args) {
        String name = "";
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
