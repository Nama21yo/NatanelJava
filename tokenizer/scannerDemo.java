package tokenizer;

import java.util.Scanner;

public class scannerDemo {
    public static void main(String[] args) {
        String str = "Java is a versatile programming language";
        
        // Creating a Scanner object
        Scanner scanner = new Scanner(str);

        System.out.println("Using Scanner class with default whitespace delimiter:");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();

        // Using a custom delimiter
        String csv = "apple,banana,orange,grape";
        Scanner csvScanner = new Scanner(csv);
        csvScanner.useDelimiter(",");

        System.out.println("\nTokens from the CSV string:");
        while (csvScanner.hasNext()) {
            System.out.println(csvScanner.next());
        }
        csvScanner.close();

        // Using multiple delimiters
        String multiDelim = "one:two;three,four";
        Scanner multiScanner = new Scanner(multiDelim);
        multiScanner.useDelimiter("[:;,]");

        System.out.println("\nTokens from the multi-delimiter string:");
        while (multiScanner.hasNext()) {
            System.out.println(multiScanner.next());
        }
        multiScanner.close();
    }
}
