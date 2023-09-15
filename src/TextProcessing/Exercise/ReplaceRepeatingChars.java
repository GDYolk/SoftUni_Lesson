package TextProcessing.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) != str.charAt(i)) {
                stringBuilder.append(str.charAt(i));
            }
        }
        System.out.print(stringBuilder);
    }
}
/*
for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(addIndex);
            if (letter != str.charAt(i)) {
                addIndex++;
                str =  String.valueOf(str.subSequence(0, addIndex)) + str.subSequence(i, str.length());
                i = addIndex;
            }
        }
        System.out.println(str);
 */
