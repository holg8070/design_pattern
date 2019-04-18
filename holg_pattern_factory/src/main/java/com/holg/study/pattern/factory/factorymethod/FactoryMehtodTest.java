package com.holg.study.pattern.factory.factorymethod;

/**
 * Created by liuhonglin on 2019-04-18.
 */
public class FactoryMehtodTest{
    public static void main(String[] args) {
        ICourseFactory factory=new PythonCourseFactory();
        factory.createCourse().record();
    }

}
