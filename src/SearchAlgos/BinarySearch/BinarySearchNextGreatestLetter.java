package SearchAlgos.BinarySearch;

public class BinarySearchNextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        char answer = nextGreatestLetter(letters, target);
        System.out.println(answer);
    }

    public static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == letters[mid] ){
                if (target >= letters[letters.length -1]){
                    return letters[0];
                }else{
                    return letters[mid + 1];
                }
            }

            if(target < letters[mid]){
                end = mid - 1;
            }else if(target > letters[mid]) {
                start = mid + 1;
            }
        }
        if (start >= letters.length){
            return letters[0];
        }else{
            return letters[start];
        }
    }
}
