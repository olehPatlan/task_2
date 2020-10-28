package ua.patlan;

public class Task2 {
    private static final String VOWELS = "aeuioyAEUIOY";

    public static String interviewRecursionTest(String line) {
        if (line.length() == 1) {
            return line;
        }

        String firstChar = line.substring(0, 1);
        String secondChar = line.substring(1, 2);
        StringBuilder sb = new StringBuilder();

        if (VOWELS.contains(firstChar) || VOWELS.contains(secondChar)) {
            return sb.append(firstChar).append("*")
                    .append(interviewRecursionTest(line.substring(1))).toString();
        }
        return sb.append(firstChar).append(interviewRecursionTest(line.substring(1))).toString();
    }
}