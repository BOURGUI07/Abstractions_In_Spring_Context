/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxies;

import POJO.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author hp
 */
@Component
@Qualifier("PUSH")
public class PushNotification implements CommentProxy{
    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending Push Notification for text: " + comment.getText());
        System.out.println("Written by Author: " + comment.getAuthor());
    }
}
