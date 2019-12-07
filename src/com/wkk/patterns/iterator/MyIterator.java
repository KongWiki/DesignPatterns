package com.wkk.patterns.iterator;

/**
 * @Time: 19-12-7下午3:51
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public interface MyIterator {
    // 是否存在下一个元素
    public abstract boolean hasNext();
    // 获取下一个元素
    public abstract Object next();
}
