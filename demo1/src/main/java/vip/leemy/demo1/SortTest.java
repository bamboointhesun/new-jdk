package vip.leemy.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Carmine
 * @Date: 2022/1/5-14:08
 * @Description: 函数式编程示例
 */
public class SortTest {
    public static void main(String[] args) {

        List<Integer> aa = new ArrayList<>();
        List<String> bb = new ArrayList<>();

        SortTest sortTest = new SortTest();
//        sortTest.test(bb); // 报错
        sortTest.test(aa);


//        List<String> names1 = new ArrayList<String>();
//        names1.add("Google ");
//        names1.add("Leemy ");
//        names1.add("Taobao ");
//        names1.add("Baidu ");
//        names1.add("Sina ");
//        names1.add("Bing ");
        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Leemy ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");
        names2.add("Bing ");
        List<Student> stu = new ArrayList<>();
        Student lee = new Student("lee", 23);
        Student carmine = new Student("carmine", 24);
        Student judy = new Student("judy", 22);



        stu.add(lee);
        stu.add(carmine);
        stu.add(judy);
        stu.sort(Comparator.comparingInt(Student::getAge));
//        stu.sort(Comparator.comparing(Student::getName));
        System.out.println(stu);
//        SortTest tester = new SortTest();
//        System.out.println("使用 Java 7 语法: ");
//
//        tester.sortUsingJava7(names1);
//        System.out.println(names1);
//        System.out.println("使用 Java 8 语法: ");
//        tester.sortUsingJava8(names2);
//        System.out.println(names2);

    }
    // 使用 java 7 排序
//    private void sortUsingJava7(List<String> names){
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.compareTo(s2);
//            }
//        });
//    }
    // 使用 java 8 排序
    private void sortUsingJava8(List<String> names){
//        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        Collections.sort(names, String::compareTo);
//        names.sort(Comparator.naturalOrder());
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Student{
        private String name;
        private int age;
    }

    private void test(List<? extends Number> ar){
        System.out.println("");
    }

}
