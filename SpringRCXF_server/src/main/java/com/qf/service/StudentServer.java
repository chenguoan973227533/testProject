package com.qf.service;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Created by Administrator on 2018\3\13 0013.
 */
public class StudentServer {
    public static void main(String[] args) {
        JAXRSServerFactoryBean bean=new JAXRSServerFactoryBean();
        bean.setServiceBean(new StudentServiceImpl());
        bean.setServiceClass(StudentServiceImpl.class);
        bean.setAddress("http://localhost:8090/student");
        bean.create();
    }
}
