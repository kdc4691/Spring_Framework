package kr.ac.inhatc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inhatc.mvc.service.JspService;

@Controller
public class JspController {
  @RequestMapping("hello")
  public String hello() {
	  return "hello";
  }
  
  @RequestMapping("gugudan")
  public String gugu(Model model,int num) {
	  model.addAttribute("id",num);
	  return "gugudan";
  }
  
  @RequestMapping("sum")
  public String sum(Model model,int num) {
	  model.addAttribute("id",num);
	  return "sum";
  }
  
	/*
	 * @RequestMapping("board") public String board(Model model,String id) {
	 * model.addAttribute("id",id); return "board"; }
	 */
  
  @Autowired
  JspService jspService;
  
  @RequestMapping("/board2")
  public ModelAndView board2(@RequestParam("id") String str) {
	  ModelAndView mv = new ModelAndView();
	  mv.addObject("title","ModelAndView");
	  mv.addObject("count",jspService.jsp());
	  mv.addObject("param",str);
	  mv.setViewName("board");	  
	  return mv;
  }
}
