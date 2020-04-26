package com.course.topic;
import com.course.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepositiory extends CrudRepository<Topic,String> {

}
