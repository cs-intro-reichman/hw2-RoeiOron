public class Collatz {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean isVerbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            if (seed == 1 && isVerbose == true) {
                System.out.println("1 4 2 1 (4)");
			}
            int currentNumber = seed;
            int steps = 0; 

            if (isVerbose == true) {
                System.out.print(currentNumber + " "); 
            }

            while (currentNumber != 1) {
                
                if ((currentNumber % 2) == 0) {
                    currentNumber = currentNumber / 2;
                } else {
                    currentNumber = currentNumber * 3 + 1;
                }
                
                steps++;

                if (isVerbose == true) {
                    System.out.print(currentNumber + " ");
                }
            }

            if (isVerbose == true) {
                System.out.println("(" + steps + ")");
            }
        }
        
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}