// Задача 3. Удаление пустых строк из текста
// Дана строка с несколькими строками текста, разделенными переводами строки.
// Напишите метод, который удаляет все пустые строки из текста.
// Пример:
// line1

// line2

// line3

// Результат:
// line1
// line2
// line3

class TextCleaner {
    public String removeEmptyLines(String text) {
        String[] lines = text.split("\n");
        StringBuilder cleanedText = new StringBuilder();

        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {    
                    cleanedText.append("\n");
                }
                cleanedText.append(line);
                }
            }
            return cleanedText.toString();
        }
    }
                
public class Printer {
   
    public static void main(String[] args) {
        String text = "";
        if (args.length == 0) {
            text = "line1\n\nline2\n\nline3";
        } 
        else {
            text = args[0];
        }
        TextCleaner ans = new TextCleaner();
        System.out.println(ans.removeEmptyLines(text));
    }
}


