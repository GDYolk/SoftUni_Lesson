package ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class Articles {
    private String title;
    private String content;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(", ");
        Articles articles = new Articles();
        articles.setTitle(strings[0]);
        articles.setContent(strings[1]);
        articles.setAuthor(strings[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().trim().split(": ");

            switch (line[0]) {
                case "Edit" -> articles.setContent(line[1]);
                case "ChangeAuthor" -> articles.setAuthor(line[1]);
                case "Rename" -> articles.setTitle(line[1]);
            }
        }
        System.out.printf("%s - %s: %s",
                articles.getTitle(), articles.getContent(), articles.getAuthor());
    }
}
