package io.kubesphere.devops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("IBK 기업은행 시연 페이지 입니다.", new HelloWorldController().sayHello());
    }
}
