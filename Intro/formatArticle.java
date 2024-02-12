import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "This is a sample text. It contains multiple sentences? Some of them have exclamation marks! We will format it based on the specified width.";
        int width = 20;

        List<String> formattedArticle = formatArticle(text, width);
        for (String line : formattedArticle) {
            System.out.println(line);
        }
    }

    public static List<String> formatArticle(String text, int width) {
        List<String> formattedLines = new ArrayList<>();
        String[] sentences = text.split("(?<=[.!?])\\s");

        StringBuilder currentLine = new StringBuilder();
        for (String sentence : sentences) {
            if (currentLine.length() + sentence.length() <= width) {
                currentLine.append(sentence).append(" ");
            } else {
                formattedLines.add(currentLine.toString());
                currentLine.setLength(0);
                currentLine.append(sentence).append(" ");
            }
        }

        if (currentLine.length() > 0) {
            formattedLines.add(currentLine.toString());
        }

        return formattedLines;
    }
}
