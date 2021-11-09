package com.JenelleHanson.YogaSite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.JenelleHanson.YogaSite.services.CommentService;

@Controller
public class CommentController {
	@Autowired
	private CommentService cServ;
}
