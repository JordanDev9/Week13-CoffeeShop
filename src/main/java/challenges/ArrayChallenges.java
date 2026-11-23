package challenges;

// SECTION C: Arrays. for loops over an array, and a 2D array.
// The test is src/test/java/challenges/ArrayChallengesTest.java.
// Change only the lines marked YOUR CODE. Each method says what to give back.
// Refresh: Part 08 (for loops and nested loops), Part 10 (arrays and 2D arrays).

public class ArrayChallenges {

    // The lowest price in the array. If the array is empty, give back 0.0.
    //   cheapest({3.25, 2.00, 4.50}) -> 2.0
    //   cheapest({5.0})              -> 5.0
    //   cheapest({})                 -> 0.0
    public static double cheapest(double[] prices) {
        if (prices.length == 0) {
            return 0.0;
        }

        double cheapest = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < cheapest) {
                cheapest = prices[i];
            }
        }

        return cheapest;
    }

    // How many prices are MORE than limit? (Equal to limit does not count.)
    //   countOver({3.25, 2.00, 4.50}, 3.00) -> 2
    //   countOver({3.25, 2.00, 4.50}, 4.50) -> 0
    public static int countOver(double[] prices, double limit) {
        int count = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > limit) {
                count++;
            }
        }

        return count;
    }

    // Each row is one day. Each number in the row is how many cups were sold in one hour.
    // Give back the row number (starting at 0) of the day that sold the most cups in total.
    // If two days tie, give back the first one. If there are no rows, give back -1.
    //   busiestDay({{5, 9}, {20, 1}, {3, 3}}) -> 1    (row totals are 14, 21, 6)
    //   busiestDay({{4, 4}, {8}})             -> 0    (a tie: 8 and 8, so the first)
    public static int busiestDay(int[][] cups) {
        if (cups.length == 0) {
            return -1;
        }

        int busiestRow = 0;
        int mostCups = 0;

        for (int row = 0; row < cups.length; row++) {

            int total = 0;

            for (int col = 0; col < cups[row].length; col++) {
                total += cups[row][col];
            }

            if (total > mostCups) {
                mostCups = total;
                busiestRow = row;
            }
        }

        return busiestRow;
    }
}
