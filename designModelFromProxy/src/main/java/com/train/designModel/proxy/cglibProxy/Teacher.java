package com.train.designModel.proxy.cglibProxy;

//被代理对象，不需要事先接口即可
public class Teacher {
    public String teach() {
        System.out.println(" cglib老师授课中.... ");
        return "上课中";
    }

    public void sayHello(String name) {
        System.out.println("hello cglib " + name);
    }
}

