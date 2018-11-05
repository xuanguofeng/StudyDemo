package com.xuanguofeng.javademo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射测试
 */
public class Reflection {


    public static void main(String[] args) {
//        try {
//            Class mclass1 = Class.forName("main.fanshe.Person");
//            Class mclass2 = Person.class;
//            Person person=new Person();
//            Class<? extends Person> aClass = person.getClass();
//
//            Field[] declaredFields = mclass1.getDeclaredFields();
//
//
//            System.out.println(mclass1.getName());
//            System.out.println(mclass2.getName());
//            System.out.println(declaredFields[0]);
//            System.out.println(declaredFields[1]);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


//        Person person = new Person();
//        Class<? extends Person> aClass = person.getClass();
//
//        System.out.println(aClass.getName());


//        Class<? extends Person> aClass = Person.class;
//        System.out.println(aClass.getName());
//        System.out.println(int.class);
        try {
            Class mclass1 = Class.forName("main.fanshe.Person");

            Object o = mclass1.newInstance();

            System.out.println(mclass1.getName());


            Field[] declaredFields = mclass1.getDeclaredFields();//获取Class对象的所有属性

            Field[] fields = mclass1.getFields();//获取class对象的public属性

            Field ageField = mclass1.getDeclaredField("age");//获取class指定属性
            ageField.setAccessible(true);
            ageField.setInt(o, 22);


            Method[] methods = mclass1.getDeclaredMethods();//获取class对象的所有声明方法
            Method[] allMethods = mclass1.getMethods();//获取class对象的所有public声明方法
            Method method = mclass1.getMethod("getAge");//根据方法名返回方法
            Method method2 = mclass1.getMethod("getAge", String.class);//根据带指定形参列表的public方法
            System.out.println(method.toString());
            method.invoke(o);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
