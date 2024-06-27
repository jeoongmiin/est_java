package Week3;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {
    private List<Book<T>> books; // 객체들을 저장하는 ArrayList

    // BookShelf의 기본 생성자로, books 필드를 빈 ArrayList로 초기화한다.
    public BookShelf() {
        books = new ArrayList<>();
    }

    // 매개변수로 전달받은 도서를 books에 추가
    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    // 매개변수로 전달받은 도서를 books에서 삭제
    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    // 도서 제목으로 검색 (대소문자 구분 X, 부분 일치 포함)
    @Override
    public List<Book<T>> searchByTitle(String title) {
        List<Book<T>> list = new ArrayList<>();
        for (Book<T> book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                list.add(book);
            }
        }
        return list;
    }

    // 도서 저자로 검색 (대소문자 구분 X, 부분 일치 포함)
    @Override
    public List<Book<T>> searchByAuthor(String author) {
        List<Book<T>> list = new ArrayList<>();
        for (Book<T> book : books) {
            if(book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                list.add(book);
            }
        }
        return list;
    }
}