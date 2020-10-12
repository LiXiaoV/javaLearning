package com.xiaov.callBackTest;

/**
 * @author xiaov
 * @create_time 2020-10-08 4:10 下午
 */
public class Teacher implements Callback {
    private Student student;

    public Teacher(Student student) {
        this.student = student;
    }

    public void askQuestion() {
        student.resolveQuestion(this);
    }

    @Override
    public void tellAnswer(int answer) {
        System.out.println("知道了，你的答案是" + answer);
    }
}
