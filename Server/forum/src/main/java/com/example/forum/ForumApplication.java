package com.example.forum;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ForumApplication {

	int idMaker;
	List<ForumEintrag> forumList = new ArrayList<ForumEintrag>();


	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	  }
	  @GetMapping("/forum")
	  public String showForum(@RequestBody ForumEintrag eintag) {
		return String.format(forumList.toString());
	  }

	  @PostMapping("/forum")
	  public String makeForum(@RequestBody ForumEintrag eintrag){
		eintrag.setId(idMaker++);
		forumList.add(eintrag);
		return eintrag.toString();
	  }
}
