package tokenizer;

public class splitMethodDemo {
    public static void main(String[] args) {
        String str = "Java is a versatile programming language";
        
        // Splitting the string based on whitespace
        String[] tokens = str.split(" ");

        System.out.println("Using split() method:");
        for (String token : tokens) {
            System.out.println(token);
        }

        // Splitting with a different delimiter
        String csv = "apple,banana,orange,grape";
        String[] fruits = csv.split(",");

        System.out.println("\nTokens from the CSV string:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Splitting with multiple delimiters
        String multiDelim = "one:two;three,four";
        String[] parts = multiDelim.split("[:;,]");

        System.out.println("\nTokens from the multi-delimiter string:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}

