package com.codesigne.myrh;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Objects;

public class SpringApplicationContext implements ApplicationContextAware {
  private static ApplicationContext CONTEXT;
  @Override
    public void setApplicationContext(ApplicationContext applicationContext)throws BeansException{
      CONTEXT = applicationContext;
  }

  public static Objects getBean(String beanName){
      return (Objects) CONTEXT.getBean(beanName);
  }
}
