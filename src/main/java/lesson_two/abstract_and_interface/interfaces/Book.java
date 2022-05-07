package lesson_two.abstract_and_interface.interfaces;

public interface Book {
    int sizeBook();
    String textByPage(int page);
    String textByRange(int start, int end);
    int findPageByText(String text); // Find first page contain text
    String text();
}
