package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex09 {
    public static void main(String[] args) {
            String mobile = "010-3514-1231";
        System.out.println(checkMobile(mobile));

    }

    public static boolean checkMobile(String mobile) {

        Pattern pattern = Pattern.compile("^01[016]-\\d{3,4}-\\d{4}");
        Matcher matcher = pattern.matcher(mobile);

        boolean matched = matcher.find();

        return false;
    }
}
