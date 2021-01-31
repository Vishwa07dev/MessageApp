package com.upgrad.messaging.service;

import org.springframework.stereotype.Component;


@Component
public class MessengerService  implements MessageService{


  public void send(String msg) {
    System.out.println("Messenger is sending message : "+msg);
  }
}
