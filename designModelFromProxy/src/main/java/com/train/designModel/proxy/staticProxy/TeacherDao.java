package com.train.designModel.proxy.staticProxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("teacher start lesson。。。");
    }
}
