public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int numberOfTimes = Integer.parseInt(args[1]);
        word = word.toUpperCase();
        String specialLetters = "AEFHILMNORSX";
        int i = 0;
        while(i < word.length()) {
            char letter = word.charAt(i);
            if (specialLetters.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a  " + letter + ": " + letter + "!");
            }
            i++;
        }

        System.out.println("What does that spell?");
        int j = 0;
        while (j < numberOfTimes) {
            System.out.println(word + "!!!");
            j++;
        }
    }
}