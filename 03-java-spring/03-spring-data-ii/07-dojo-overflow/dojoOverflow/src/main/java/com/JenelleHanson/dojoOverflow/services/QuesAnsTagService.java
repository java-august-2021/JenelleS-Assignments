package com.JenelleHanson.dojoOverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.dojoOverflow.models.Answer;
import com.JenelleHanson.dojoOverflow.models.Question;
import com.JenelleHanson.dojoOverflow.models.Tag;
import com.JenelleHanson.dojoOverflow.repositories.AnswerRepository;
import com.JenelleHanson.dojoOverflow.repositories.QuestionRepository;
import com.JenelleHanson.dojoOverflow.repositories.TagRepository;

@Service
public class QuesAnsTagService {
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private AnswerRepository aRepo;
	@Autowired
	private TagRepository tRepo;
	
	public QuesAnsTagService(QuestionRepository qRepo, AnswerRepository aRepo, TagRepository tRepo) {
		this.qRepo = qRepo;
		this.aRepo = aRepo;
		this.tRepo = tRepo;
	}
	
	//Questions section
	public List<Question> allQuestions(){
		return this.qRepo.findAll();
	}
	
	public Question findQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	
	public Question saveQuestion(Question question) {
		return this.qRepo.save(question);
	}
	
	
	
	//Answers section
	public List<Answer> allAnswers(){
		return this.aRepo.findAll();
	}
	
	public Answer findAnswer(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	
	public Answer saveAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
	
	
	
	
	//Tags section
	public List<Tag> allTags(){
		return this.tRepo.findAll();
	}
	
	public Tag findTag(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
	
	//Combined section
	public void addToQuestionList(Long quesId, Long tagId) {//Pass these in the correct order
	    
	    // retrieve an instance of a question using another method in the service.
	    Question thisQuestion = findQuestion(quesId);
	    
	    // retrieve an instance of a tag using another method in the service.
	    Tag thisTag = findTag(tagId);
	    
	    // add the question to this tag's list of questions
	    thisTag.getQuestions().add(thisQuestion);
	    
	    // Save thisTag, since you made changes to its questions list.
	    tRepo.save(thisTag);
	}

	public void addToTagList(Long tagId, Long quesId) {//Pass these in the correct order
	    
	    Question thisQuestion = findQuestion(quesId);
	    
	    Tag thisTag = findTag(tagId);
	    
	    // add the tag to this question's list of tags
	    thisQuestion.getTags().add(thisTag);
	    
	    qRepo.save(thisQuestion);
	}
}
