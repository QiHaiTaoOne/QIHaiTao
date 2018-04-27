package com.xjyq.Aspc;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD, ElementType.TYPE})
@Inherited
public @interface Login {

    boolean value() default true;

}