package com.course.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepositiory topicRepositiory;

    public List<Topic> getAllTopics(){
        List<Topic> topics=new ArrayList<>();
        topicRepositiory.findAll().forEach(t->topics.add(t));
        return topics;
    }
    public Topic getTopic(String id){
        return topicRepositiory.findById(id).get();
    }
    public void addTopic(Topic topic){
        topicRepositiory.save(topic);
    }
    public void updateTopic(Topic topic){
        topicRepositiory.save(topic);
    }
    public void deleteTopic(String id){
        topicRepositiory.deleteById(id);
    }
}
