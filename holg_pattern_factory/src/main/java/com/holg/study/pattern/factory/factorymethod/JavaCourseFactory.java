package com.holg.study.pattern.factory.factorymethod;

import com.holg.study.pattern.factory.ICourse;
import com.holg.study.pattern.factory.JavaCourse;
import com.holg.study.pattern.factory.abstactfactory.INote;
import com.holg.study.pattern.factory.abstactfactory.IVideo;

/**
 * Created by liuhonglin on 2019-04-18.
 */
class JavaCourseFactory implements ICourseFactory {


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
