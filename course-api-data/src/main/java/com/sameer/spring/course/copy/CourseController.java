package com.sameer.spring.course.copy;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topic")
	public List<Topics> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Topics getTop(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/topic")
	public void addTopic(@RequestBody Topics topics){
		topicService.addTopic(topics);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/topic/{id}")
	public void updateTopic(@RequestBody Topics topics,@PathVariable String id){
		topicService.updateTopic(id,topics);
		
	}

}
