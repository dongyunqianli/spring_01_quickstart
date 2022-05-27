package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {

    //5.删除 业务层中 使用new的方式创建的dao对象
    private BookDao bookDao;

    public void save(){
        System.out.println("book service save...");
        bookDao.save();
    }

//    public void setBookDao(BookDao bookDao){
//        this.bookDao=bookDao;
//    }


    //6.提供 相应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
