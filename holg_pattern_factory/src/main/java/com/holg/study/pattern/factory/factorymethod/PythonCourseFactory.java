package com.holg.study.pattern.factory.factorymethod;

import com.holg.study.pattern.factory.ICourse;
import com.holg.study.pattern.factory.PythonCourse;
import com.holg.study.pattern.factory.abstactfactory.INote;
import com.holg.study.pattern.factory.abstactfactory.IVideo;

/**
 * Created by liuhonglin on 2019-04-18.
 */
public class PythonCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }

    public ICourse createCourse() {
        return null;
    }

    public INote createNote() {
        return null;
    }

    public IVideo createVideo() {
        return null;
    }
}
