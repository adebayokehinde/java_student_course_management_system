import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validator {

    public static boolean validateEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validateInput(String inputStr) {
        return inputStr != null && !inputStr.trim().isEmpty();
    }

    public static boolean validateGrade(Object grade) {
        if (grade instanceof String) {
            try {
                grade = Integer.parseInt((String) grade);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        if (grade instanceof Integer) {
            int gradeInt = (Integer) grade;
            return gradeInt >= 0 && gradeInt <= 100;
        }
        return false;
    }
}

