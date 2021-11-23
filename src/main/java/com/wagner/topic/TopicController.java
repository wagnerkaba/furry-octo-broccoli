package com.wagner.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    //Explicação by WK:
    //Como a classe TopicService está anotada como @Service, a anotação
    //@Autowired abaixo faz com que o haja injeção de dependência em topicService
    //
    // @Autowired allows Spring to resolve and inject collaborating beans into our bean.
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topicsraw")
    public List<Topic> getTopicsRaw(){

        //Se http://localhost:8080/topicsra for acessado, ele vai mostrar
        //os objetos abaixo convertidos em JSON

        return Arrays.asList(
                new Topic("Spring", "Spring Framework", "description"),
                new Topic("java", "Core java", "description"),
                new Topic("javascript", "javascript", "description")
        );
    }

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }





}
