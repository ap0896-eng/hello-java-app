public class GreetingApp {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";

            // Enhanced for loop to process names
            for (String name : args) {
                result += name + ", ";
            }

            // Remove trailing comma and space using substring
            result = result.substring(0, result.length() - 2);

            // Print greeting
            System.out.println("Hello, " + result + "!");
        }
    }
}