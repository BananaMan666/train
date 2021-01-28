package com.train.designModel.proxy.staticProxy;

public class Clinet {
    public static void main(String[] args) {
        //创建目标对象(被代理对象)
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象, 同时将被代理对象传递给代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);

        //通过代理对象，调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        proxy.teach();
    }
}
