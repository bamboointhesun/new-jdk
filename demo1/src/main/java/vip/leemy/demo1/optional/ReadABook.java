package vip.leemy.demo1.optional;

import java.util.Optional;

/**
 * @Author: Carmine
 * @Date: 2022/1/6-17:34
 * @Description:
 */
public class ReadABook {


    public static void main(String[] args) {
        Books bookOne = new Books(12,"阿加莎","斯泰尔斯庄园奇案");
        Books bookTwo = null;
        Optional<Books> bookOne1 = Optional.ofNullable(bookOne);
        Optional<Books> bookTwo1 = Optional.ofNullable(bookTwo);
        System.out.println(bookOne1.isPresent());
        System.out.println(bookTwo1.isPresent());
        bookTwo1.orElseThrow(IllegalArgumentException::new);
//        bookTwo1.orElseGet();
//        Books books = bookTwo1.orElse(new Novel());
//        System.out.println(books);


    }





    



}
