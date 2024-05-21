package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 {
    public static void main(String[] args) {
        String str = "AAA 1234 BBBB 465";
        //4 글자로 구성된 단어
        Pattern p1 = Pattern.compile("\\b.{4,5}\\b"); //4글자이상 5글자 이하
        Matcher m1 = p1.matcher(str);
        if (m1.find()) {
            System.out.println(m1.group()); //1234
        }

    }
}
