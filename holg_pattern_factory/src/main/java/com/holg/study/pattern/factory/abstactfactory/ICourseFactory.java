package com.holg.study.pattern.factory.abstactfactory;

import com.holg.study.pattern.factory.ICourse;

/**抽线工厂
 * Created by liuhonglin on 2019-04-18.
 * 要求所有的自工厂都实现这个工厂
 * 一个品牌的抽象
 */
public interface ICourseFactory {
    ICourse createCourse();
    INote createNote();
    IVideo createVideo();

}
