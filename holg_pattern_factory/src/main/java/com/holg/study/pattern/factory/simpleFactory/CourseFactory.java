package com.holg.study.pattern.factory.simpleFactory;

import com.holg.study.pattern.factory.ICourse;

/**
 * Created by liuhonglin on 2019-04-18.
 */
public class CourseFactory {
//    public ICourse create(String name){
//        if(name.equals("java")){
//            return new JavaCourse();
//        }else {
//            return null;
//        }
//    }
    public ICourse create(String className){
        try {
            if (null != className||"".equals(className)){
                return (ICourse) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

        public ICourse create(Class clazz){
        try {
            if (null!=clazz){
                return (ICourse) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
