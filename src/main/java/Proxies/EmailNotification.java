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
@Qualifier("EMAIL")
public class EmailNotification implements CommentProxy{
    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending Email Notification for Text: " + comment.getText());
        System.out.println("By Author: " + comment.getAuthor());
    }
}
