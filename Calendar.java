package task1and2;

    public class Calendar {

        //Variables that live inside the class
        private int year;
        private int month;
        private int day;
        
    public Calendar() {
        //Constructor to give value to the private variables
        this.year = 2020;
        this.month = 1;
        this.day = 1;
    }

    public Calendar(Calendar anotherCalendar) {
        //constructor to set the values using another object of the same class
        this.year = anotherCalendar.year;
        this.month = anotherCalendar.month;
        this.day = anotherCalendar.day;
    }
    
    public Calendar (int year, int month, int day) {
        //Constructor to set values manually
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public boolean isLeapYear() {
        //Function to calculate if it's a leap year
        if (year % 4 != 0 && month == 2) {
            return false;
        }
        else if (year % 100 != 0 && month == 2) {
            return true;
        }
        else if (year % 400 != 0 && month == 2) {
            return false;
        }
        else if (month == 2) {
            return true;
        }
        else {
            return false;
        }
    }
       
    public boolean equals(Calendar anotherCalendar) {
        //function to compare 2 objects
        //will return true if the minor and major axis are the same on the 2 given Calendar objects
        return year == anotherCalendar.year && month == anotherCalendar.month && day == anotherCalendar.day;
    }
    
    @Override
    public String toString() {
        //toString() function to be used by default in the object to print in the console
        String str = String.format("%-1d/%-1d/%-1d",month,day,year);
        return str;
    }
    
    public void setYear(int year) {
        //function to set year
        this.year = year;
    }
    
    public void setMonth (int month) {
        //function to set month
        this.month = month;
    }
    
    public void setDay(int day) {
        //function to set day
        this.day = day;
    }
    
    public int getDaysInMonth() {
        //funtion to get days in the given month to the objectmonth
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        else if (month == 2 && isLeapYear() == true) {
            return 29;
        }
        else {
            return 28;
        }
    }

    public int increaseYear() {
        //Funtion to increase year by 1
        return year++;
    }
    
    public int increaseMonth() {
       //Funtion to increase month by 1
       if (month == 12) {
          increaseYear(); 
       return month = 1;
       
       }
       else if (month < 12) {
           return month++;
       }
       else return -1;
       }
    
    public int increaseDays() {
        //Funtion to increase days by 1
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
        if (day < 31) {
            return day++;
        }else if (day == 31) {
            increaseMonth();
            return day = 1;
                    }
        }
        if  (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 30) {
                return day++;
            } 
            else if ( day == 30) {
                increaseMonth();
                return day = 1;
            }
    }

        if (month == 2 && isLeapYear() == true) {
            if (day < 29) {
                return day++;
            } 
            else if (day == 29) {
            increaseMonth();
            return day = 1;
            }
        }

        if (month == 2 && isLeapYear() == false) {
            if (day < 28) {
                return day++;
            } else if (day == 28) {
                increaseMonth();
                return day = 1;
            }
        }
        return -1;
    }
    
    public int getYear(int year) {
        //funtion to call the value of the year of the object
        return year;
    }
    
    public int getMonth(int month) {
        //funtion to call the value of the month of the object
        return month;
    }
    
    public int getDay(int day) {
        //funtion to call the value of the day of the object
        return  day;
    }
}
