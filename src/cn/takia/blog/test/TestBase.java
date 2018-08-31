package cn.takia.blog.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试的集成类，返回ApplicationContext对象，方便使用
 */
public abstract class TestBase {
    public ApplicationContext getContext() {
        String[] conf = {"conf/spring-mybatis.xml","conf/spring-mvc.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
        return ctx;
    }
}

