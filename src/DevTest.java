import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double value = SafeInput.getDouble(in, "Enter any double");
        System.out.println("You entered: " + value);
    }
}
