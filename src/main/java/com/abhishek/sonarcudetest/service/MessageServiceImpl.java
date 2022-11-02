package com.abhishek.sonarcudetest.service;

import org.springframework.stereotype.Service;

/**
 * Created by Intellij.
 * Author: abhishekpeiris
 * Date: 2022-11-02
 * Time: 11:59
 */
@Service
public class MessageServiceImpl implements MessageService{
    @Override
    public String getMessage() {
        String message = "Message Service Working";
        return message;
    }
}
