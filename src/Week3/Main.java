package Week3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookShelf<String> bookShelf = new BookShelf<>(); // String 타입의 식별자를 사용하는 BookShelf 객체 생성
        BookStack<Integer> bookStack = new BookStack<>(); // Integer 타입의 식별자를 사용하는 BookStack 객체를 생성

        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 String 타입의 도서 정보 입력 받기
        System.out.print("Title: ");
        String shelfTitle = scanner.nextLine();
        System.out.print("Author: ");
        String shelfAuthor = scanner.nextLine();
        System.out.print("Identifier: ");
        String shelfIdentifier = scanner.nextLine();

        // 사용자로부터 Integer 타입의 도서 정보 입력 받기
        System.out.print("Title: ");
        String stackTitle = scanner.nextLine();
        System.out.print("Author: ");
        String stackAuthor = scanner.nextLine();
        System.out.print("Identifier: ");
        Integer stackIdentifier = scanner.nextInt();
        scanner.nextLine();

        // 사용자로부터 입력 받은 도서 정보를 이용하여 Book 객체 생성하고 추가
        Book<String> shelfBook = new Book<>(shelfTitle, shelfAuthor, shelfIdentifier);
        bookShelf.addBook(shelfBook);
        Book<Integer> stackBook = new Book<>(stackTitle, stackAuthor, stackIdentifier);
        bookStack.pushBook(stackBook);

        // BookShelf 에서 도서 제목과 저자로 검색을 수행하고, 검색 결과를 출력
        System.out.println("Books found: " + bookShelf.searchByTitle("a little prince"));
        System.out.println("Books found: " + bookShelf.searchByAuthor("saint exupery"));

        // BookStack 에서 도서를 꺼내고, 꺼낸 도서의 정보 출력
        try {
            Book<Integer> popBook = bookStack.popBook();
            System.out.println(popBook.getTitle());
        } catch (EmptyStackException e) {
            System.out.println("스택이 비어있음!");
        }

        // BookStack 에서 맨 위의 도서를 확인하고 해당 도서의 정보 출력
        try {
            Book<Integer> peekBook = bookStack.peekBook();
            System.out.println(peekBook.getTitle());
        } catch (EmptyStackException e) {
            System.out.println("스택이 비어있음!");
        }

        // BookStack이 비어있는지 확인하고 결과 출력
        System.out.println(bookStack.isEmpty());
    }
}