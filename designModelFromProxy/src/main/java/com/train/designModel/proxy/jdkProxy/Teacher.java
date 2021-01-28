package com.train.designModel.proxy.jdkProxy;

//被代理对象
public class Teacher implements ITeacher {
    @Override
    public void teach() {
        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}

