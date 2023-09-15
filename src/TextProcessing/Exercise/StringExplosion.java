package TextProcessing.Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split(">");
        StringBuilder stringBuilder = new StringBuilder();


        int remain = 0;
        for (String s : str) {
            if (s.equals("")){
                stringBuilder.append(">");
                continue;
            }
             if (Character.isDigit(s.charAt(0))) {
                int number = Integer.parseInt(String.valueOf(s.charAt(0)));
                number += remain;
                if (number <= s.length()) {
                    remain = 0;
                    stringBuilder.append(s.substring(number)).append(">");
                } else {
                    remain += number - s.length();
                    stringBuilder.append(">");
                }
            } else
                stringBuilder.append(s).append(">");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        System.out.println(stringBuilder);
    }
}
