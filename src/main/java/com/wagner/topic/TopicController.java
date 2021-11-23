package com.wagner.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topicsraw")
    public List<Topic> getAllTopics(){

        //Se http://localhost:8080/topicsra for acessado, ele vai mostrar
        //os objetos abaixo convertidos em JSON

        return Arrays.asList(
                new Topic("Spring", "Spring Framework", "description"),
                new Topic("java", "Core java", "description"),
                new Topic("javascript", "javascript", "description")
        );

    }

}
