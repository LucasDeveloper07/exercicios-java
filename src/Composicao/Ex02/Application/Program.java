package Composicao.Ex02.Application;

import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import Composicao.Ex02.Entities.Comment;
import Composicao.Ex02.Entities.Post;

public class Program {
    
    public static void main(String[] args) {
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        Instant horaCmt1 = Instant.from(fmt.parse("21/06/2018 13:05"));

        Comment comment1 = new Comment ("Have a nice trip!");
        Comment comment2 = new Comment ("Wow that's awesome!");

        Post post1 = new Post(horaCmt1,
            "Traveling to New Zeland",
            "I'm going to visit this wonderful country!",
            12);
        
        post1.addComment(comment1);
        post1.addComment(comment2);

        System.out.println(post1);
    }
}
