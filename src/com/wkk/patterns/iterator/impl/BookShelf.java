package com.wkk.patterns.iterator.impl;

import com.wkk.patterns.iterator.Aggregate;
import com.wkk.patterns.iterator.Book;
import com.wkk.patterns.iterator.MyIterator;

import java.util.ArrayList;
import java.util.List;


/**
 * @Time: 19-12-7下午3:56
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class BookShelf implements Aggregate {
    private List<Book> books;
    private int last = 0;

    public BookShelf(int intialSize){
        this.books = new ArrayList<>(intialSize);
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(book);
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public MyIterator iterator() {
        return  new BookShelfIterator(this);
    }
}
