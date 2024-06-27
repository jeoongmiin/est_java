package Week3;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
    private Stack<Book<T>> books; // 객체들을 저장하는 Stack

    // BookStack 클래스의 기본 생성자로, books 필드를 빈 Stack으로 초기화
    public BookStack() {
        books = new Stack<>();
    }

    // 매개변수로 전달받은 도서를 Stack의 맨 위에 추가
    public void pushBook(Book<T> book) {
        books.push(book);
    }

    // Stack의 맨 위에 있는 도서를 제거하고 반환
    public Book<T> popBook() {
        if (books.isEmpty()) { // Stack이 비어있는 경우 EmptyStackException을 throw
            throw new EmptyStackException();
        }
        return books.pop();
    }

    // Stack의 맨 위에 있는 도서 반환 (제거 X)
    public Book<T> peekBook() {
        if (books.isEmpty()) { // Stack이 비어있는 경우 EmptyStackException을 throw
            throw new EmptyStackException();
        }
        return books.peek();
    }

    // Stack이 비어있는지 여부 반환
    public boolean isEmpty() {
        return books.isEmpty();
    }
}