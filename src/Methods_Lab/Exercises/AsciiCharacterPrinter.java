package Methods_Lab.Exercises;

public class AsciiCharacterPrinter {
    public static void main(String[] args) {
        char char1 = '#';
        char char2 = ':';
        printCharactersInRange(char1, char2);
    }

    public static void printCharactersInRange(char start, char end) {
        // Swap start and end if start is greater than end
        if (start >  end) {
            char temp = end;
            end = start;
            start = temp;
        }

        // Print all characters in the range
        for (char ch = (char) (start+1); ch < end; ch++) {
            System.out.print(ch + " ");
        }
    }
}
