/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import POJO.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository
@Qualifier("FILE")
public class FileRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing Comment Text: " + comment.getText() + " in a file");
    }
}
