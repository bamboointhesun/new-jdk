package vip.leemy.demo1.defaultMethod;

import cn.hutool.core.util.StrUtil;

/**
 * @Author: Carmine
 * @Date: 2022/1/6-19:30
 * @Description: 有一个boos接口
 */
public interface Books {

    void tellYouTopic(String topic);


    void tellYouAuthor(String name);


    default void tellYouPrice(int price){
        String format = StrUtil.format("Boos接口默认实现书的价格 {} 元", price);
        System.out.println(format);
    }


}
