package com.wagner.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {



    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("Spring", "Spring Framework", "description"),
                    new Topic("java", "Core java", "description"),
                    new Topic("javascript", "javascript", "description")
            )
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


    public void addTopíc(Topic topic) {

        topics.add(topic);

    }
}
