public class CalcPi {
    public static void main(String [] args) { 
        int numberOfTimes = Integer.parseInt(args[0]);
        double j = 1; 
        double piAdd = 0;
        double sign = 1; 
        double pi = Math.PI;
        for (int i=0; i < numberOfTimes; i++) {
            double term = sign / j;
            piAdd = piAdd + term;
            j = j + 2;
            sign = sign * -1.0; 
        }
        double myPi = piAdd * 4;
		System.out.println("pi according to Java: " + pi);
        System.out.println("pi, approximated: "+ myPi);
    }
}