import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution {
    class weekDay{
        int day = this.day;
        int month = this.month;
        int year = this.year;
    }
    public String dayOfTheWeek(int day, int month, int year) {
        String[] str = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int[] daysM = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        // Check for the leapyear
        if(leapYear(year)){
            daysM[2] = 29;
        }

        int dayYear = 4;

        for(int i = 1971; i < year; i++){
            if(leapYear(i)){
                dayYear += 366;
            } else{
                dayYear += 365;
            }
        }


        for(int i = 1; i < month; i++){
            dayYear += daysM[i];
        }
        dayYear += day; // cur day

        return str[dayYear % 7];        
    }

    private boolean leapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        return false;
    }
}