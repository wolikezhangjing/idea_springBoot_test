package com.xss.design_patterns_demo.proxy;

/**
 * @Title: ClientTest
 * @Description: 动态代理客户端测试
 * @author: TC20014
 * @date: 2019/8/1 16:08
 * @Version: 1.0
 */
public class ClientTest {

    public static void main(String[] args) {
        LGPhoneSubjectImpl lgPhoneSubject = new LGPhoneSubjectImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(lgPhoneSubject);
        IPhoneSubject iPhoneSubject = DynamicProxy.newProxyInstance(LGPhoneSubjectImpl.class.getClassLoader()
                , LGPhoneSubjectImpl.class.getInterfaces()
                , myInvocationHandler);
        iPhoneSubject.call("18952015201");

        LGPhoneSubjectImpl lgPhoneSubject1 = new LGPhoneSubjectImpl();
        IPhoneSubject iPhoneSubject1 = SubjectDynamicProxy.newProxyInstance(lgPhoneSubject1);
        iPhoneSubject1.call("17012341234");
    }
}
