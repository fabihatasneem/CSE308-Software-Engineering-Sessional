package Problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Editor editor = Editor.getInstance();
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String[] splitText = fileName.split("\\.");
        String language = splitText[splitText.length-1];

        editor.getLanguageInfo(language);
    }
}
