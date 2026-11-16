import java.util.Scanner;

public class Calc {
    public static void main(String[] args, int[] nums) {
        Scanner = new Scanner(System.in);
        String in = in.nextString;
        if (args.length == 0 || nums.length == 0) {
            System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
            return;
		}
		if (!args.contains("add", "mult", "max", "min")) {
            System.err.println("Unknown operation: " + in);
            return;
        }
        
    }
}
