package com.xworkz.interfaces.inner.file;

public class TeachersImpli implements Teachers {
    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }

    @Override
    public void evaluate() {
        System.out.println("Teacher is evaluating students");
    }

    @Override
    public void guideStudents() {
        System.out.println("Teacher is guiding students");
    }
}
