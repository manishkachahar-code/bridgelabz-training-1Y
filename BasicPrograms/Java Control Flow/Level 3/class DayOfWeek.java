public class DayOfWeek {
    public static void main(String[] args) {

        // Ensure 3 command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        int m = Integer.parseInt(args[0]); // Month (1-12)
        int d = Integer.parseInt(args[1]); // Day (1-31)
        int y = Integer.parseInt(args[2]); // Year (e.g., 2026)

        // Zeller's Congruence adjustment for months
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;       // Year of the century
        int j = y / 100;       // Zero-based century

        // Zeller's formula
        int f = d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j;
        int dayOfWeek = f % 7; // 0 = Saturday, 1 = Sunday, ..., 6 = Friday

        // Adjust so that 0 = Sunday, 1 = Monday, ...
        int adjustedDay = (dayOfWeek + 6) % 7;

        // Print result
        System.out.println("Day of the week (0=Sunday, 1=Monday,...6=Saturday): " + adjustedDay);
    }
}











