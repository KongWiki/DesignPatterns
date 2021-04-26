package com.wkk.patterns.iterator;


/**
 * @Time: 19-12-7下午3:49
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public interface Aggregate {
    // 用于遍历集合的迭代器
    public abstract MyIterator iterator();
}
