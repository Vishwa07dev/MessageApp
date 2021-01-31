package com.upgrad.messaging;

import com.upgrad.messaging.Controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.upgrad.messaging");

    MessageController messageController = (MessageController) context.getBean("messageController");

    messageController.sendMessage("Hello Students");
  }
}
