package PracticeQuestion;

public class countWords {
  public static void main(String[] args) {
    String str = "Java is easy to learn";
  String[] words = str.trim().split("\\s+");
  int count = str.trim().isEmpty() ? 0 : words.length;
  System.out.println("TOtal words:" + count);
  }
}
