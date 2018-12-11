package com.geekerstar.service;

import com.geekerstar.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author geekerstar
 * @date 2018/12/8
 * description
 */
@Service
public class BookService {

    @Qualifier("bookDao")
    @Autowired(required = false)
    private BookDao bookDao2;

    public void print(){
        System.out.println(bookDao2);

    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao2 +
                '}';
    }
}
