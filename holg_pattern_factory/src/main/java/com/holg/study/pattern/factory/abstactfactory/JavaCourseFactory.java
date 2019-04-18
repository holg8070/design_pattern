package com.holg.study.pattern.factory.abstactfactory;

import com.holg.study.pattern.factory.ICourse;
import com.holg.study.pattern.factory.JavaCourse;
import com.holg.study.pattern.factory.factorymethod.*;

/**
 * Created by liuhonglin on 2019-04-18.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
