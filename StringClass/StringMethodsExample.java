public class StringMethodsExample {

    public static void main(String[] args) {
        String str = "Hello";

        // 1. length()
        System.out.println("Length: " + str.length()); 
        // Output: Length: 5

        // 2. charAt(int index)
        System.out.println("Character at index 1: " + str.charAt(1)); 
        // Output: Character at index 1: e

        // 3. substring(int beginIndex)
        System.out.println("Substring from index 2: " + str.substring(2)); 
        // Output: Substring from index 2: llo

        // 4. substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 1 to 4: " + str.substring(1, 4)); 
        // Output: Substring from index 1 to 4: ell

        // 5. contains(CharSequence s)
        System.out.println("Contains 'ell': " + str.contains("ell")); 
        // Output: Contains 'ell': true

        // 6. equals(Object obj)
        System.out.println("Equals 'Hello': " + str.equals("Hello")); 
        // Output: Equals 'Hello': true

        // 7. equalsIgnoreCase(String anotherString)
        System.out.println("EqualsIgnoreCase 'hello': " + str.equalsIgnoreCase("hello")); 
        // Output: EqualsIgnoreCase 'hello': true

        // 8. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase()); 
        // Output: Uppercase: HELLO

        // 9. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase()); 
        // Output: Lowercase: hello

        // 10. trim()
        String strWithSpaces = "  Hello  ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'"); 
        // Output: Trimmed: 'Hello'

        // 11. replace(char oldChar, char newChar)
        System.out.println("Replace 'l' with 'p': " + str.replace('l', 'p')); 
        // Output: Replace 'l' with 'p': Heppo

        // 12. replace(CharSequence target, CharSequence replacement)
        System.out.println("Replace 'll' with 'yy': " + str.replace("ll", "yy")); 
        // Output: Replace 'll' with 'yy': Heyyo

        // 13. split(String regex)
        String[] parts = str.split("l");
        System.out.println("Split by 'l': " + String.join(", ", parts)); 
        // Output: Split by 'l': He, , o

        // 14. indexOf(int ch)
        System.out.println("Index of 'l': " + str.indexOf('l')); 
        // Output: Index of 'l': 2

        // 15. indexOf(String str)
        System.out.println("Index of 'lo': " + str.indexOf("lo")); 
        // Output: Index of 'lo': 3

        // 16. lastIndexOf(int ch)
        System.out.println("Last index of 'l': " + str.lastIndexOf('l')); 
        // Output: Last index of 'l': 3

        // 17. startsWith(String prefix)
        System.out.println("Starts with 'He': " + str.startsWith("He")); 
        // Output: Starts with 'He': true

        // 18. endsWith(String suffix)
        System.out.println("Ends with 'lo': " + str.endsWith("lo")); 
        // Output: Ends with 'lo': true

        // 19. isEmpty()
        System.out.println("Is empty: " + str.isEmpty()); 
        // Output: Is empty: false

        // 20. join(CharSequence delimiter, CharSequence... elements)
        String joined = String.join("-", "Java", "is", "fun");
        System.out.println("Joined string: " + joined); 
        // Output: Joined string: Java-is-fun

        // 21. format(String format, Object... args)
        String formatted = String.format("Name: %s, Age: %d", "John", 30);
        System.out.println("Formatted string: " + formatted); 
        // Output: Formatted string: Name: John, Age: 30

        // 22. matches(String regex)
        System.out.println("Matches 'H.llo': " + str.matches("H.llo")); 
        // Output: Matches 'H.llo': true

        // 23. compareTo(String anotherString)
        System.out.println("Compare to 'Hello': " + str.compareTo("Hello")); 
        // Output: Compare to 'Hello': 0

        // 24. compareToIgnoreCase(String str)
        System.out.println("CompareToIgnoreCase 'hello': " + str.compareToIgnoreCase("hello")); 
        // Output: CompareToIgnoreCase 'hello': 0

        // 25. toCharArray()
        char[] chars = str.toCharArray();
        System.out.println("ToCharArray: " + java.util.Arrays.toString(chars)); 
        // Output: ToCharArray: [H, e, l, l, o]

        // 26. valueOf(Object obj)
        String value = String.valueOf(123);
        System.out.println("ValueOf 123: " + value); 
        // Output: ValueOf 123: 123

        // 27. concat(String str)
        System.out.println("Concat with ' World': " + str.concat(" World")); 
        // Output: Concat with ' World': Hello World
    }
}
