package com.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@MyAnnotation
public class TestAnnotation {
//    注解可以显示赋值，如果该没有默认值，就必须赋值
    @MyAnnotation(name = "lx")
    public void test() {}

    @MyAnnotation2("hh")
    public void test2() {}

}

// 自定义注解
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
//@Documented
//@Inherited
@interface MyAnnotation {
//    注解的参数： 参数类型 + 参数名（）；
    String name() default "";
    int age() default 0;
    int id() default -1; // 默认值为-1代表不存在

    String[] schools() default { "哈哈哈哈哈", "嘿嘿嘿嘿嘿" };
}

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
//  只有一个参数成员，一般参数名为value
    String value();
}
