public class GetName {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Your name is: " + args[0]);
        } else {
            System.out.println("No name provided.");
        }
    }
}
