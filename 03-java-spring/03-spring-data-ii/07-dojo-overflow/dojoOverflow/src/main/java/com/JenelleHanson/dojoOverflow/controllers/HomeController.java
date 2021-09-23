package com.JenelleHanson.dojoOverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.JenelleHanson.dojoOverflow.models.Answer;
import com.JenelleHanson.dojoOverflow.models.Question;
import com.JenelleHanson.dojoOverflow.models.Tag;
import com.JenelleHanson.dojoOverflow.services.QuesAnsTagService;

@Controller
@RequestMapping("/questions")
public class HomeController {
	@Autowired
	private final QuesAnsTagService qSer;

	public HomeController(QuesAnsTagService qSer) {
		this.qSer = qSer;
	}

	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("allQuestions", qSer.allQuestions());
		model.addAttribute("allTags", qSer.allTags());
		return "home.jsp";
	}
	
	
	@GetMapping("/new")
	public String newQuestion(@ModelAttribute("question") Question question, Model model) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/new")//always redirect for safety
	public String sendQuestion(@Valid @ModelAttribute("question") Question question, BindingResult result, @ModelAttribute("subject") Tag Subject, Model model) {
		if(result.hasFieldErrors()) {
			model.addAttribute("questionTxt");
			model.addAttribute("subject");
		}
		Question thisQuestion = this.qSer.saveQuestion(question);
		Long id = thisQuestion.getId();
		return "redirect:/questions/" + id;
	}
	
	
	@GetMapping("/{id}")
	public String showQuestion(@ModelAttribute("answer") Answer answer, @PathVariable("id") Long id, Model model) {
		model.addAttribute("question", qSer.findQuestion(id));//this is referring to the question id variable. this will talk to the form every time you type question
		return "showQuestion.jsp";
	}
	
	@PostMapping("/{id}")
	public String answerIt(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasFieldErrors()) {
			model.addAttribute("answerTxt");
		}
		Answer saveAnAnswer = new Answer();
		saveAnAnswer.setAnswerTxt(answer.getAnswerTxt());
		saveAnAnswer.setQuestion(this.qSer.findQuestion(id));
		this.qSer.saveAnswer(saveAnAnswer);
		return "redirect:/questions/" + id;
	}
}
