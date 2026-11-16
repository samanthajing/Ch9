public class Longest {
    public static void main(String[] args) {
        int l = 0;
        String s = "";
        for (String arg : args) {
            if (arg.length() > l) {
                l = arg.length();
                s = arg;
            }
        }
        String f = "";
        char z = 'z';
        for (int i = 0; i < args.length - 1; i++) {
			if (args[i].charAt(0) < z) {
				z = (args[i].charAt(0));
				f = (args[i]);
			}
		}
        System.out.println("The longest is " + s);
        System.out.println("The first alphabetically is " + f);
    }
}
