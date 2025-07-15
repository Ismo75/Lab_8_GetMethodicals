import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);

        String mNum = SafeInput.getRegExString(in, "Enter your UC M number (M12345)", "^(M|m)\\d{5}$");
        System.out.println("M Number: " + mNum);

        String menu = SafeInput.getRegExString(in, "Enter menu option [O/S/V/Q]", "^[OoSsVvQq]$");
        System.out.println("Menu choice: " + menu);
    }
}