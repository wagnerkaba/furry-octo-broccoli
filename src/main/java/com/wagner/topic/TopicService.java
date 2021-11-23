package com.wagner.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("Spring", "Spring Framework", "description"),
                new Topic("java", "Core java", "description"),
                new Topic("javascript", "javascript", "description")
            );

    public List<Topic> getAllTopics() {
        return topics;
    }


}
