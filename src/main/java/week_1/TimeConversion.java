package week_1;

public class TimeConversion {

    public static String timeConversion(String s) {

        String convertedString;
        if (s.contains("P")) {
            convertedString = String.valueOf(
                    (Integer.parseInt
                            (s.substring(0, 2)) + 12))
                    + s.substring(2, 8);

            if (convertedString.substring(0, 2).equals("24")) {
                convertedString = convertedString.replace("24", "12");
            }

        }
        else {
            convertedString = s.substring(0, 8);
            if (convertedString.substring(0, 2).equals("12")) {
                convertedString = convertedString.replace("12", "00");
            }
        }

        return convertedString;
    }
}
