import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // SSN Test
        String ssn = SafeInput.getRegExString(in, "Enter SSN (format: ###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN Entered: " + ssn);

        // M Number Test
        String mNumber = SafeInput.getRegExString(in, "Enter M number (format: M12345)", "^(M|m)\\d{5}$");
        System.out.println("M Number Entered: " + mNumber);

        // Menu Choice Test
        String menu = SafeInput.getRegExString(in, "Enter menu option [O/S/V/Q]", "^[OoSsVvQq]$");
        System.out.println("Menu Choice Entered: " + menu);
    }
}
