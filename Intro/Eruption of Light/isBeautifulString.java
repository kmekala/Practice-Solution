/*the method counts the frequency of each letter in the input string and checks if the frequencies are 
in non-increasing order. If they are, it returns true; otherwise, it returns false.*/


public class BeautifulStringChecker {
    public static void main(String[] args) {
        String input = "bbbaacdafe";
        boolean isBeautiful = isBeautifulString(input);
        System.out.println(isBeautiful); // Output: true (3,3,1,1,1,1,0,0...)
    }

    public static boolean isBeautifulString(String inputString) {
        int[] a = new int[26];
        int k = 0;
        int count = 0;
        for (char y = 'a'; y <= 'z'; y++) {
            count = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (y == inputString.charAt(i)) {
                    count++;
                }
            }
            a[k++] = count;
        }
        for (int i = 1; i < 26; i++) {
            if (a[i - 1] < a[i]) {
                return false;
            }
        }
        return true;
    }
}
