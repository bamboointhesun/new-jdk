package vip.leemy.demo1.optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Carmine
 * @Date: 2022/1/6-17:39
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int price;
    private String author;
    private String title;


    public static void main(String[] args) {
        String aa = "ss";
    }
}
