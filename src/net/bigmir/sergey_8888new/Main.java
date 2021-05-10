package net.bigmir.sergey_8888new;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args)   {
        MyClass.test(5,5);
        final Class<?> cls = MyClass.class;
        Method[] methods = cls.getMethods();
        for (Method method : methods){
            if(method.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation an = method.getAnnotation(MyAnnotation.class);
                try {
                    method.invoke(null,an.a(),an.b());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
