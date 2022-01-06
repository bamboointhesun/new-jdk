package vip.leemy.demo1.defaultMethod;

import cn.hutool.core.util.StrUtil;

/**
 * @Author: Carmine
 * @Date: 2022/1/6-19:36
 * @Description: 有一个小说类
 */
public class Novel implements Books{
    @Override
    public void tellYouTopic(String topic) {
        System.out.println(StrUtil.format("小说实现 topic {}",topic));
    }

    @Override
    public void tellYouAuthor(String name) {
        System.out.println(StrUtil.format("小说实现 name {}",name));
    }
}
