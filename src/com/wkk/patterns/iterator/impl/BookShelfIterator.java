package com.wkk.patterns.iterator.impl;

import com.wkk.patterns.iterator.Book;
import com.wkk.patterns.iterator.MyIterator;

/**
 * @Time: 19-12-7下午3:56
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class BookShelfIterator implements MyIterator {
    private BookShelf bookSelf;
    private int index;


    public BookShelfIterator(BookShelf bookSelf) {
        this.bookSelf = bookSelf;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        if (index < bookSelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookSelf.getBookAt(index);
        index++;
        return book;
    }
}
