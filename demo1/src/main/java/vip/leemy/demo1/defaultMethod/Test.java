package vip.leemy.demo1.defaultMethod;

import cn.hutool.core.util.StrUtil;

/**
 * @Author: Carmine
 * @Date: 2022/1/6-19:37
 * @Description:
 */
public class Test {


    public static void main(String[] args) {


        Novel novel = new Novel();
        novel.tellYouPrice(100);
        novel.tellYouAuthor("阿加莎");
        novel.tellYouTopic("赫尔克里探案");

        System.out.println(StrUtil.AT);

        Textbooks textbooks = new Textbooks();
        textbooks.tellYouPrice(102);
        textbooks.tellYouAuthor("柯南");
        textbooks.tellYouTopic("夏洛克探案");


    }

}
