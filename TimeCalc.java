public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hoursStringOne = time.charAt(0);
        int hoursStringTwo = time.charAt(1);
        String hoursStringOneString = String.valueOf(hoursStringOne);
        int valuehoursOne = Integer.parseInt(hoursStringOneString) - '0';
        String hoursStringTwoString = String.valueOf(hoursStringTwo);
        int valuehoursTwo = Integer.parseInt(hoursStringTwoString) - '0';
        int hours = (valuehoursOne*10) + valuehoursTwo;
        int minutesStringOne = time.charAt(3);
        int minutesStringTwo = time.charAt(4);
        String minutesStringOneString = String.valueOf(minutesStringOne);
        int valueminutesOne = Integer.parseInt(minutesStringOneString) - '0';
        String minutesStringTwoString = String.valueOf(minutesStringTwo);
        int valueminutesTwo = Integer.parseInt(minutesStringTwoString) - '0';
        int minutes = (valueminutesOne*10) + valueminutesTwo;
        int totalMinutes = (hours*60) + minutes + minutesToAdd;
        int endHours = (totalMinutes/60);
        int endMinutes = (totalMinutes%60);
        int finalHours = endHours%24;
        System.out.printf("%02d:%02d\n", finalHours, endMinutes);
}
}