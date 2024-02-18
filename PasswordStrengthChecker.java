import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a password to check its strength:");
        String password = scanner.nextLine();

        int length = password.length();
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = !password.matches("[A-Za-z0-9]*");

        int strength = 0;

        if (length >= 8) {
            strength++;
        }
        if (hasUppercase) {
            strength++;
        }
        if (hasLowercase) {
            strength++;
        }
        if (hasDigit) {
            strength++;
        }
        if (hasSpecialChar) {
            strength++;
        }

        System.out.println("Password strength: " + getStrengthDescription(strength));
    }

    private static String getStrengthDescription(int strength) {
        switch (strength) {
            case 0:
            case 1:
                return "Very Weak";
            case 2:
                return "Weak";
            case 3:
                return "Moderate";
            case 4:
                return "Strong";
            case 5:
                return "Very Strong";
            default:
                return "Unknown";
        }
    }
}
