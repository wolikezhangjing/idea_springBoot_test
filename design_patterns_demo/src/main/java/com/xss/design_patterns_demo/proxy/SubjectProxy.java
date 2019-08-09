package com.xss.design_patterns_demo.proxy;

public class SubjectProxy implements ISubject {

    private ISubject iSubject = null;

    public SubjectProxy(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void subjectName(String name) {
        this.iSubject.subjectName(name);
    }

    @Override
    public void subjectAction(String text) {
        this.iSubject.subjectAction(text);
    }

    @Override
    public void subjectActionEnd(String text) {
        this.iSubject.subjectActionEnd(text);
    }
}
