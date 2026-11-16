public class Stats {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Stats <numbers>");
            return;
        }

        int count = args.length;
        System.out.println("There are " + count + " integers");

        int sum = 0;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            sum += value;
        }
        System.out.println("The sum is " + sum);

        int max = Integer.MIN_VALUE;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The largest is " + max);

        int min = Integer.MAX_VALUE;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value < min) {
                min = value;
            }
        }
        System.out.println("The smallest is " + min);

        double avg = sum / count;
        System.out.print("The average is ");
        System.out.printf("%.2f", avg);
        System.out.println();
    }
}
