public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        
        // Read the input (the user's name)
        String name = scanner.nextLine();
        
        // Greet the user
        System.out.println("Hello, " + name + "! Nice to meet you.");
        
        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
