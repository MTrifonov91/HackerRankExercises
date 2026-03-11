package week_1;

public class CamelCase4 {

    public static String transformString(String input) {

        String[] parts = input.split(";");
        String op = parts[0];
        String type = parts[1];
        String text = parts[2];

        if (op.equals("S")) {

            if (type.equals("M")) {
                text = text.replace("()", "");
            }

            String result = text
                    .replaceAll("([A-Z])", " $1")
                    .toLowerCase();

            return result.trim();

        } else {

            String[] words = text.split(" ");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length; i++) {

                if (i == 0 && !type.equals("C")) {
                    result.append(words[i]);
                } else {
                    result.append(
                            words[i].substring(0, 1).toUpperCase()
                                    + words[i].substring(1)
                    );
                }
            }

            if (type.equals("M")) {
                result.append("()");
            }

            return result.toString();
        }
    }
}
