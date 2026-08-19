class Solution {
    public int dayOfYear(String date) {

        // Extract year, month, day
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        // Days in each month
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Leap year
        if (isLeapYear(year)) {
            days[1] = 29;
        }

        // Add days of previous months
        int result = day;

        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }

        return result;
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }
}