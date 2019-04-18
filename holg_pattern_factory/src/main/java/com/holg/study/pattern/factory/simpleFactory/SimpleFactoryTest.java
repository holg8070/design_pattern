package com.holg.study.pattern.factory.simpleFactory;

import com.holg.study.pattern.factory.ICourse;
import com.holg.study.pattern.factory.PythonCourse;

/**
 * Created by liuhonglin on 2019-04-18.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
//        ICourse course=new JavaCourse();
        CourseFactory factory=new CourseFactory();
//        ICourse course = factory.create("com.holg.study.pattern.factory.simpleFactory.JavaCourse");
        ICourse course = factory.create(PythonCourse.class);
        course.record();
    }
}
