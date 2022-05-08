package lesson_two.abstract_and_interface.interfaces;

/**
 * Реализиовать класс LessonBook который должен описывать интерфейс Book
 * Абстрактной работы с книгой, книга представлена в виде массива String, где индекс это страница, а значение это текст.
 * <p>
 * Для упрощения тестирования страницы начинаются с 0
 * <p>
 * После реализации тесты нужно расскомментировать!
 * <p>
 * Если ничего не нашлось то возвращем для int -1, для String "";
 */
public class LessonBook implements Book {
    private String book[];

    @Override
    public int sizeBook() {
        return book.length;
    }

    @Override
    public String textByPage(int page) {
        if ((page >= book.length) || (page < 0)) {
            return "";
        }
        return book[page];
    }

    @Override
    public String textByRange(int start, int end) {
        if ((start > book.length) || (start < 0) || (start > end) || (end < 0) || (end > book.length)) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(book[i]);
        }
        return result.toString();
    }

    @Override
    public int findPageByText(String text) {
        for (int i = 0; i < book.length; i++) {
            if (book[i].indexOf(text) > -1) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String text() {
        if (book.length < 1) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < book.length; i++) {
            result.append(book[i]);
        }
        return result.toString();

    }

    public LessonBook(String[] book) {
        this.book = book;
    }

    public LessonBook() {
    }

    public void setBook(String[] book) {
        this.book = book;
    }
}
