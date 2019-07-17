package com.sameer.spring.course.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
	private List<Topics> topic =  new ArrayList<>(Arrays.asList( new Topics ("spring", "Spring Framework", "SFD")));
	
	public List<Topics> getAllTopics(){
		return topic;
	}
	
	public Topics getTopic (String id){
		return topic.stream().filter(t->t.getId().equals(id)).findFirst().get();

}
	
	public void addTopic (Topics topics){
		topic.add(topics);
	}

	public void updateTopic(String id, Topics topics) {
		// TODO Auto-generated method stub
		for(int i = 0; i<topic.size(); i++){
			Topics t = topic.get(i);
			if(t.getId().equals(id)){
				topic.set(i, topics);
				return;
			}
		}
		
	}

}
