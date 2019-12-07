package com.wkk.patterns.iterator;

import com.wkk.patterns.iterator.impl.BookShelf;

/**
 * @Time: 19-12-7下午4:05
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Gone with wind"));
        MyIterator it = (MyIterator) bookShelf.iterator();
        while ((it.hasNext())){
            Book book = (Book) it.next();
            System.out.println(book.getName() + " ");
        }

    }
}
