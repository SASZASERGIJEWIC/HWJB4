import java.util.Scanner;

public class jHW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String firstWord = scanner.nextLine();
        System.out.println("Введите второе слово:");
        String secondWord = scanner.nextLine();
        String sum = returnNewWord(firstWord, secondWord);
        System.out.println("При сложении первой половины первого слова и второй половины второго слова " +
                "образуется: " + sum);
    }
    static String returnNewWord (String strOne, String strTwo) {
        int lengthone = strOne.length();
        int lengthtwo = strTwo.length();

        int midIndexOfFirstString = lengthone / 2;
        int midIndexOfSecondString = lengthtwo / 2;

        String firstHalfOfFirstString = strOne.substring(0, midIndexOfFirstString);
        String secondHalfOfSecondString = strTwo.substring(midIndexOfSecondString, lengthtwo);

        String result = firstHalfOfFirstString + secondHalfOfSecondString;

        return result;
    }
}