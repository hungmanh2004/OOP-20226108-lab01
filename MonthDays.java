import java.util.Scanner;

public class MonthDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int year;
        
        while (true) {
            System.out.print("Enter a month (name, abbreviation, or number): ");
            month = scanner.nextLine().trim().toLowerCase();

            if (isValidMonth(month)) {
                break;  // valid month entered
            } else {
                System.out.println("Invalid month. Please try again.");
            }
        }
        
        while (true) {
            System.out.print("Enter a year: ");
            String yearInput = scanner.nextLine().trim();
            
            if (isValidYear(yearInput)) {
                year = Integer.parseInt(yearInput);
                break;  // valid year entered
            } else {
                System.out.println("Invalid year. Please enter a valid 4-digit year.");
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("The month has " + days + " days.");
    }
    
    private static boolean isValidMonth(String month) {
        String[] validMonths = {
            "january", "jan.", "jan", "1",
            "february", "feb.", "feb", "2",
            "march", "mar.", "mar", "3",
            "april", "apr.", "apr", "4",
            "may", "5",
            "june", "jun.", "jun", "6",
            "july", "jul.", "jul", "7",
            "august", "aug.", "aug", "8",
            "september", "sept.", "sep", "9",
            "october", "oct.", "oct", "10",
            "november", "nov.", "nov", "11",
            "december", "dec.", "dec", "12"
        };
        for (String validMonth : validMonths) {
            if (validMonth.equals(month)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean isValidYear(String yearInput) {
        try {
            int year = Integer.parseInt(yearInput);
            return year >= 0 && yearInput.length() == 4;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int getDaysInMonth(String month, int year) {
        switch (month) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 31;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return isLeapYear(year) ? 29 : 28;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 31;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 30;
            case "may":
            case "5":
                return 31;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 30;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 31;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 31;
            case "september":
            case "sept.":
            case "sep":
            case "9":
                return 30;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 31;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 30;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 31;
            default:
                return 0;
        }
    }
    
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
