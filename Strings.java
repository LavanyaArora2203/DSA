public class Strings {


    public static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(str.charAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(r))) {
                r--;
                continue;
            }
            if (Character.toLowerCase(str.charAt(l)) !=
                Character.toLowerCase(str.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;    // matched one character
            }
            j++;        // always move in t
        }

        return i == s.length();
    }

    
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (l < r) {
            if (vowels.indexOf(arr[l]) == -1) {
                l++;                      // not a vowel → move left
            } 
            else if (vowels.indexOf(arr[r]) == -1) {
                r--;                      // not a vowel → move right
            } 
            else {
                // both are vowels → swap
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }



    


    public static void main(String[] args) {
        String str="My name is Lavanya";
        System.out.println(str.charAt(5));
        System.out.println(str.length());
        char[] charArray=str.toCharArray();
        System.out.println(charArray);
        System.out.println(str.substring(0,10));
        String s1="hello";
        


    }
}
