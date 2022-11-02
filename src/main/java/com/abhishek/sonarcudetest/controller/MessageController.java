package com.abhishek.sonarcudetest.controller;

import com.abhishek.sonarcudetest.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij.
 * Author: abhishekpeiris
 * Date: 2022-11-02
 * Time: 12:01
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping()
    public ResponseEntity<String> getMessage() {
        System.out.println("called");
        return ResponseEntity.ok(messageService.getMessage());
    }
}
