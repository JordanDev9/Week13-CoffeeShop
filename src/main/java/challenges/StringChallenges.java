package challenges;

// SECTION B: Strings. length, charAt, substring, indexOf, toUpperCase, trim, equals.
// The test is src/test/java/challenges/StringChallengesTest.java.
// Change only the lines marked YOUR CODE. Each method says what to give back.
// Refresh: Part 11 (String methods and wrapper classes), Part 14 (printf).

public class StringChallenges {

    public static String orderCode(String name, char size) {

        String code;

        if (name.length() < 3) {
            code = name.toUpperCase();
        } else {
            code = name.substring(0, 3).toUpperCase();
        }

        return code + "-" + Character.toUpperCase(size);
    }

    public static String cupName(String name) {

        name = name.trim();

        if (name.length() == 0) {
            return "Guest";
        }

        return Character.toUpperCase(name.charAt(0))
                + name.substring(1).toLowerCase();
    }

    public static int countWord(String order, String word) {

        if (word.length() == 0) {
            return 0;
        }

        order = order.toLowerCase();
        word = word.toLowerCase();

        int count = 0;
        int index = 0;

        while ((index = order.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }

    public static String receiptLine(String name, double price) {

        String result = name;

        while (result.length() < 20) {
            result += ".";
        }

        result += "$" + String.format("%.2f", price);

        return result;
    }
}