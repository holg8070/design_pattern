package com.holg.study.pattern.factory.abstactfactory;


/**
 * Created by liuhonglin on 2019-04-18.
 * 慎用
 */
public class AbstactFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory=new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote().note();
        factory.createVideo().video();
    }
}
