/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import POJO.Comment;
import Proxies.CommentProxy;
import Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class CommentService {
    private CommentProxy proxy;
    private CommentRepository repo;
    
    @Autowired
    public CommentService(@Qualifier("EMAIL") CommentProxy proxy,@Qualifier("FILE") CommentRepository repo){
        this.proxy=proxy;
        this.repo=repo;
    }
    
    public void publishComment(Comment comment){
        this.repo.storeComment(comment);
        this.proxy.sendComment(comment);
    }
}
