package vip.leemy.demo1.defaultMethod;

import cn.hutool.core.util.StrUtil;

/**
 * @Author: Carmine
 * @Date: 2022/1/6-19:35
 * @Description: 有一个教材类
 */
public class Textbooks implements Books {
    @Override
    public void tellYouTopic(String topic) {
        System.out.println(StrUtil.format("教材实现 topic {}",topic));
    }

    @Override
    public void tellYouAuthor(String name) {
        System.out.println(StrUtil.format("教材实现 topic {}",name));
    }
}
