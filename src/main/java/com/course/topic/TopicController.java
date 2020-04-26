package com.course.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topic")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }
    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
    @RequestMapping(method= RequestMethod.POST,value="/topic")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/topic")
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
