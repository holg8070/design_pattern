package com.holg.study.pattern.factory.abstactfactory;

import com.holg.study.pattern.factory.ICourse;

/**
 * Created by liuhonglin on 2019-04-18.
 */
public class JavaNote implements INote {
    public void note() {
        System.out.println("正在编写java课程笔记");
    }
}
