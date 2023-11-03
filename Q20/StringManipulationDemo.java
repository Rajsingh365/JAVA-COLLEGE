package Q20;

public class StringManipulationDemo {
    public static void main(String[] args) {
        // Function 1: Concatenating Strings
        String str1 = "Hello, ";
        String str2 = "world!";
        String result = str1 + str2;
        System.out.println("Concatenation: " + result);

        // Function 2: Length of a String
        String text = "Java Programming";
        int length = text.length();
        System.out.println("Length of the string: " + length);

        // Function 3: Converting to Uppercase and Lowercase
        String sampleText = "Example Text";
        String upperCaseText = sampleText.toUpperCase();
        String lowerCaseText = sampleText.toLowerCase();
        System.out.println("Uppercase: " + upperCaseText);
        System.out.println("Lowercase: " + lowerCaseText);

        // Function 4: Substring
        String originalString = "This is a sample string.";
        String subString = originalString.substring(5, 11);
        System.out.println("Substring: " + subString);

        // Function 5: Searching for Substrings
        String sentence = "The quick brown fox jumps over the lazy dog.";
        boolean containsWord = sentence.contains("fox");
        System.out.println("Contains 'fox': " + containsWord);
    }
}

