public class TimeFormatter {

    public static void main(String[] args) {

        formatDuration(3662);
        // formatDuration(1);
        // formatDuration(120);
        // formatDuration(62);
        // formatDuration(3600);
        // formatDuration(4723293);
        // formatDuration(126144000);
        formatDuration(126144000 + 5875200 + 10800 + 240);

    }

    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        String result = "";

        int years = seconds / 31536000;
        int days = (seconds - (years * 31536000)) / 86400;
        int hour = (seconds - (days * 86400) - (years * 31536000)) / 3600;
        int minutes = (seconds - (hour * 3600) - (days * 86400) - (years * 31536000)) / 60;
        int second = (seconds - (minutes * 60) - (hour * 3600) - (days * 86400) - (years * 31536000));

        System.out.println("second: " + second);

        if (years == 1) {
            result = result + years + " year";
        }
        if (years >= 1) {
            result = result + years + " years";
        }

        if (days == 1) {
            if (hour == 0 && minutes == 0 && second == 0) {
                if (result.length() != 0)
                    result = result + " and ";
            } else if (result.length() != 0) {
                result = result + ", ";
            }
            result = result + days + " day";
        }
        if (days > 1) {
            if (hour == 0 && minutes == 0 && second == 0) {
                if (result.length() != 0)
                    result = result + " and ";
            } else if (result.length() != 0) {
                result = result + ", ";
            }
            result = result + days + " days";
        }

        if (hour == 1) {
            if (minutes == 0 && second == 0) {
                if (result.length() != 0)
                    result = result + " and ";
            } else if (result.length() != 0) {
                result = result + ", ";
            }
            result = result + hour + " hour";
        }
        if (hour > 1) {
            if (minutes == 0 && second == 0) {
                if (result.length() != 0)
                    result = result + " and ";
            } else if (result.length() != 0) {
                result = result + ", ";
            }
            result = result + hour + " hours";
        }

        if (minutes == 1) {
            if (second == 0) {
                if (result.length() != 0)
                    result = result + " and ";
            } else if (result.length() != 0) {
                result = result + ", ";
            }
            result = result + minutes + " minute";
        }
        if (minutes > 1) {
            if (second == 0) {
                if (result.length() != 0)
                    result = result + " and ";
            } else if (result.length() != 0) {
                result = result + ", ";
            }
            result = result + minutes + " minutes";
        }

        if (second == 1) {
            if (result.length() != 0)
                result = result + " and ";
            result = result + second + " second";
        }

        if (second > 1) {
            if (result.length() != 0)
                result = result + " and ";
            result = result + second + " seconds";
        }

        System.out.println(result);

        return result;

    }

}

/*
 * Your task in order to complete this Kata is to write a function which formats
 * a duration, given as a number of seconds, in a human-friendly way.
 * 
 * The function must accept a non-negative integer. If it is zero, it just
 * returns "now". Otherwise, the duration is expressed as a combination of
 * years, days, hours, minutes and seconds.
 * 
 * It is much easier to understand with an example:
 * 
 * For seconds = 62, your function should return
 * "1 minute and 2 seconds"
 * For seconds = 3662, your function should return
 * "1 hour, 1 minute and 2 seconds"
 * For the purpose of this Kata, a year is 365 days and a day is 24 hours.
 * 
 * Note that spaces are important.
 * 
 * Detailed rules
 * The resulting expression is made of components like 4 seconds, 1 year, etc.
 * In general, a positive integer and one of the valid units of time, separated
 * by a space. The unit of time is used in plural if the integer is greater than
 * 1.
 * 
 * The components are separated by a comma and a space (", "). Except the last
 * component, which is separated by " and ", just like it would be written in
 * English.
 * 
 * A more significant units of time will occur before than a least significant
 * one. Therefore, 1 second and 1 year is not correct, but 1 year and 1 second
 * is.
 * 
 * Different components have different unit of times. So there is not repeated
 * units like in 5 seconds and 1 second.
 * 
 * A component will not appear at all if its value happens to be zero. Hence, 1
 * minute and 0 seconds is not valid, but it should be just 1 minute.
 * 
 * A unit of time must be used "as much as possible". It means that the function
 * should not return 61 seconds, but 1 minute and 1 second instead. Formally,
 * the duration specified by of a component must not be greater than any valid
 * more significant unit of time.
 * 
 * 
 */