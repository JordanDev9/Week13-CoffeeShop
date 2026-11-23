package challenges;

import java.util.ArrayList;

// SECTION D: ArrayList. add, get, size, and the for-each loop.
// The test is src/test/java/challenges/ListChallengesTest.java.
// Change only the lines marked YOUR CODE. Each method says what to give back.
// Refresh: Part 12 (ArrayList and the for-each loop).

public class ListChallenges {

    public static ArrayList<String> removeSoldOut(ArrayList<String> items, String soldOut) {

        ArrayList<String> result = new ArrayList<>();

        for (String item : items) {
            if (!item.equalsIgnoreCase(soldOut)) {
                result.add(item);
            }
        }

        return result;
    }

    public static String longestName(ArrayList<String> names) {

        if (names.size() == 0) {
            return "";
        }

        String longest = names.get(0);

        for (int i = 1; i < names.size(); i++) {
            if (names.get(i).length() > longest.length()) {
                longest = names.get(i);
            }
        }

        return longest;
    }

    public static boolean hasRepeat(ArrayList<String> names) {

        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    return true;
                }
            }
        }

        return false;
    }
}