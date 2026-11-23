package challenges;

// SECTION A: Logic. if, else if, && and ||, and a little math.
// The test is src/test/java/challenges/LogicChallengesTest.java.
// Change only the lines marked YOUR CODE. Each method says what to give back.
// Refresh: Part 06 (if and switch), Part 07 (logical operators), Part 13 (methods).

public class LogicChallenges {

    public static double sizeUpcharge(char size) {

        size = Character.toUpperCase(size);

        if (size == 'S') {
            return 0.0;
        } else if (size == 'M') {
            return 0.50;
        } else if (size == 'L') {
            return 1.00;
        }

        return -1.0;
    }

    public static boolean isHappyHour(int hour, boolean weekend) {

        if (hour < 0 || hour > 23) {
            return false;
        }

        if (weekend) {
            return hour >= 12 && hour <= 17;
        }

        return hour >= 14 && hour <= 16;
    }

    public static int freeDrinks(int stamps, int bought) {

        if (stamps < 0 || bought < 0) {
            return 0;
        }

        return (stamps + bought) / 10;
    }

    public static int coinsForChange(int cents) {

        if (cents <= 0) {
            return 0;
        }

        int coins = 0;

        coins += cents / 25;
        cents %= 25;

        coins += cents / 10;
        cents %= 10;

        coins += cents / 5;
        cents %= 5;

        coins += cents;

        return coins;
    }
}