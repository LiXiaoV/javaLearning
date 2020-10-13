package com.xiaov.callBackTest;

import org.junit.jupiter.api.Test;

/**
 * @author xiaov
 * @create_time 2020-10-08 4:14 下午
 */
public class CallbackTest {
    @Test
    public void testCallback() {
        Student student = new Ricky();
        Teacher teacher = new Teacher(student);

        teacher.askQuestion();
    }
}
