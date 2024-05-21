package exam01;

import java.util.StringTokenizer;

public class Ex04 {
    public static void main(String[] args) {
        String frits = "Apple#Orange,Melon_Banana+Mango";
        StringTokenizer st = new StringTokenizer(frits,"#,_+");

        while ((st.hasMoreTokens())) {
            String fruit = st.nextToken(frits);
        }
    }
}
