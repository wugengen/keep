package com.annotation;

import java.lang.annotation.*;

/**
 * @program: keep_studying
 * @description:类和方法的 Annotation 在缺省情况下是不出现在 javadoc 中的。
 * 如果使用 @Documented 修饰该 Annotation，则表示它可以出现在 javadoc 中。
 * @author: xxx
 * @create: 2020-04-30 16:51
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnoDemo01 {
   public String name() default "wgg";
   public int age() default 26;
   public String address() default "china";
}
