package stringoperations;

import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "AIET";
        String str2 = new String("College");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 2 in str1: " + str1.charAt(2));

        // 3. String Comparison
        String str3 = "AIET";
        System.out.println("\nstr1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase 'aiet': " + str1.equalsIgnoreCase("aiet"));

        // 4. String Searching
        String text = "Welcome to AIET College";
        System.out.println("\nIndex of 'AIET': " + text.indexOf("AIET"));
        System.out.println("Last index of 'e': " + text.lastIndexOf('e'));

        // 5. Substring Operations
        System.out.println("\nSubstring (0-7): " + text.substring(0, 7));
        System.out.println("Substring from index 11: " + text.substring(11));

        // 6. String Modification
        String modified = text.replace("AIET", "Engineering");
        System.out.println("\nAfter replace: " + modified);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String spaceStr = "   Hello Java   ";
        System.out.println("\nBefore trim: '" + spaceStr + "'");
        System.out.println("After trim: '" + spaceStr.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenation: " + concat);

        // 9. String Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("\nSplitting sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 7);
        System.out.println("\nStringBuilder result: " + sb);

        // 11. String Formatting
        String name = "Shiva";
        int marks = 90;
        String formatted = String.format("Name: %s, Marks: %d", name, marks);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation
        String email = "shiva@gmail.com";
        if (email.contains("@") && email.endsWith(".com") && !email.startsWith("@")) {
            System.out.println("\nEmail is valid");
        } else {
            System.out.println("\nEmail is invalid");
        }
    }
}