package map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class propertiesDemo {
    public static void main(String[] args) {
        // Creating a Properties object
        Properties props = new Properties();

        // Adding key-value pairs to the Properties object
        props.setProperty("username", "admin");
        props.setProperty("password", "12345");
        props.setProperty("url", "https://example.com");
        
        // Displaying all properties
        System.out.println("Properties before saving:");
        props.forEach((key, value) -> System.out.println(key + ": " + value));

        // Saving properties to a file
        try (FileOutputStream output = new FileOutputStream("config.properties")) {
            props.store(output, "Application Configuration");
            System.out.println("\nProperties saved to config.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Loading properties from a file
        Properties loadedProps = new Properties();
        try (InputStream input = propertiesDemo.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            loadedProps.load(input);
            System.out.println("\nProperties loaded from config.properties:");
            loadedProps.forEach((key, value) -> System.out.println(key + ": " + value));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Accessing a specific property
        String username = loadedProps.getProperty("username");
        System.out.println("\nLoaded username: " + username);
        
        // Providing a default value if the property is not found
        String timeout = loadedProps.getProperty("timeout", "30");
        System.out.println("Loaded timeout (with default): " + timeout);
    }
}

