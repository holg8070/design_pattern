package com.holg.study.pattern.factory.factorymethod;

import com.holg.study.pattern.factory.ICourse;
import com.holg.study.pattern.factory.abstactfactory.INote;
import com.holg.study.pattern.factory.abstactfactory.IVideo;

/**
 * Created by liuhonglin on 2019-04-18.
 */
public interface ICourseFactory {
    ICourse createCourse();
    INote createNote();
    IVideo createVideo();
}
