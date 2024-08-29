package tokenizer;

import java.util.StringTokenizer;

public class stringTokenizerDemo {
    public static void main(String[] args) {
        String str = "Java is a versatile programming language";

        // Creating a StringTokenizer object
        StringTokenizer st = new StringTokenizer(str);

        // Counting tokens
        System.out.println("Total number of tokens: " + st.countTokens());

        // Iterating through tokens
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // Example with a different delimiter
        String csv = "apple,banana,orange,grape";
        StringTokenizer csvTokenizer = new StringTokenizer(csv, ",");

        System.out.println("\nTokens from the CSV string:");
        while (csvTokenizer.hasMoreTokens()) {
            System.out.println(csvTokenizer.nextToken());
        }

        // Example with multiple delimiters
        String multiDelim = "one:two;three,four";
        StringTokenizer multiDelimTokenizer = new StringTokenizer(multiDelim, ":;,");
        
        System.out.println("\nTokens from the multi-delimiter string:");
        while (multiDelimTokenizer.hasMoreTokens()) {
            System.out.println(multiDelimTokenizer.nextToken());
        }
    }
}

