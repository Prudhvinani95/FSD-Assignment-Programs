//An anagram is a word or a phrase made by transposing the letters of another word or phrase; for example, "parliament" is an anagram of "partial men," and "software" is an anagram of "swear oft." Write a program that figures out whether one string is an anagram of another string. The program should ignore white space and punctuation.

public class AnagramStrings {
    public static boolean areAnagrams(String str1,
                                      String str2) {

        String cp1 = removeJunk(str1);
        String cp2 = removeJunk(str2);

	    cp1 = cp1.toLowerCase();
	    cp2 = cp2.toLowerCase();

	    cp1 = sort(cp1);
	    cp2 = sort(cp2);

        return cp1.equals(cp2);
    }
    protected static String removeJunk(String str) {
        int i, len = str.length();
        StringBuilder sb = new StringBuilder(len);
  		char c;

	    for (i = (len - 1); i >= 0; i--) {
	        c = str.charAt(i);
	        if (Character.isLetter(c)) {
		        sb.append(c);
	        }
	    }

        return sb.toString(); 
    }

    protected static String sort(String str) {
	    char[] charArray = str.toCharArray();

	    java.util.Arrays.sort(charArray);

        return new String(charArray);
    }

    public static void main(String[] args) {
        String str1 = "Cosmo and Laine:";
        String str2 = "Maid, clean soon!";

        System.out.println();
        System.out.println("Testing whether the following "
                         + "strings are anagrams:");
        System.out.println(" String1: " + str1);
        System.out.println(" String 2: " + str2);
        System.out.println();

        if (areAnagrams(str1, str2)) {
            System.out.println("They are anagrams");
        } else {
            System.out.println("They are not anagrams");
        }
        System.out.println();
    }
}