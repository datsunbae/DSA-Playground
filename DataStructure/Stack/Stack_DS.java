package Stack;

import java.util.Stack;

public class Stack_DS {
    public static void main(String[] args){
        Stack<String> stackBooks = new Stack<String>();
        stackBooks.push("Toi thay hoa vang tren co xanh");
        stackBooks.push("Nhung ngay tho au");
        stackBooks.push("De men phieu luu ky");
        stackBooks.push("Tuoi tho du doi");

        System.out.println("Size stackbooks: " + stackBooks.size());

        System.out.println("My stackbooks: " + stackBooks);

        System.out.println("Peek book: " + stackBooks.peek());

        String popBook = stackBooks.pop();
        System.out.println("Pop book: " + popBook);
        System.out.println("My stackbooks after pop book: " + stackBooks);

        System.out.println("Search book: " + stackBooks.search("Toi thay hoa vang tren co xanh"));
    }
}
