package kr.ac.inhatc.mvc.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.sql.Blob;

import kr.ac.inhatc.mvc.dto.BoardDto;
import kr.ac.inhatc.mvc.service.BoardService;

@Controller
public class MvcController {
	@Autowired
	BoardService boardService;
	
	   @RequestMapping("/main")
	   public ModelAndView shop(String searchKeyword, String searchCondition) throws Exception{
	      ModelAndView mv =new ModelAndView();	      
	      mv.setViewName("welcome");
	      return mv;
	   }	 
	   
	   @RequestMapping("/loginMember")
	   public ModelAndView loginMember() throws Exception{
	      ModelAndView mv =new ModelAndView();	      
	      mv.setViewName("loginMember");
		return mv;
	   }	 	   	  
	   
	   @RequestMapping("/login.do")
	   public ModelAndView login(String inputUserName) throws Exception{
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("loginID",boardService.login(inputUserName));
		 mv.setViewName("loginMember");
		 return mv;
	   }
	   
	   @RequestMapping("/addMember.do")
	   public ModelAndView addMember() throws Exception{
		 ModelAndView mv = new ModelAndView();
	     mv.setViewName("addMember");
		 return mv;
	   }

	   
		  @RequestMapping("/registUser.do")
		  public ModelAndView registUser(String id,
				  String pw, String name, String gender, String email , String birthday, String phone , String address) throws Exception{
			  HashMap<String, String> hashMap = new HashMap<String, String>();
			  hashMap.put("id",id);
			  hashMap.put("pw",pw);
			  hashMap.put("name",name);
			  hashMap.put("gender",gender);
			  hashMap.put("email",email);
			  hashMap.put("birthday",birthday);
			  hashMap.put("phone",phone);
			  hashMap.put("address",address);
			  boardService.registUser(hashMap);
			  return loginMember();  
		  }	   
	   
	   @RequestMapping("/products.do")
	   public ModelAndView products() throws Exception{
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("products",boardService.products());
	     mv.setViewName("products");
		 return mv;
	   }
	   
	   @RequestMapping("/addProduct.do")
	   public ModelAndView addProduct() throws Exception{
		 ModelAndView mv = new ModelAndView();
	     mv.setViewName("addProduct");
		 return mv;
	   }
	   
		  @RequestMapping("/registProduct.do")
		  public ModelAndView registProduct(String pcode,
				  String pname, String price, String detail, String company , String classification , String amount) throws Exception{
			  HashMap<String, String> hashMap = new HashMap<String, String>();
			  hashMap.put("pcode",pcode);
			  hashMap.put("pname",pname);
			  hashMap.put("price",price);
			  hashMap.put("detail",detail);
			  hashMap.put("company",company);
			  hashMap.put("classification",classification);
			  hashMap.put("amount",amount);
			  boardService.registProduct(hashMap);
			  return shop("","");  
		  }	   	   
		  
		   @RequestMapping("/showupdateProduct.do")
		   public ModelAndView showupdateProduct(String pcode) throws Exception{
			 ModelAndView mv = new ModelAndView();
		     mv.setViewName("updateProduct");
			 return mv;
		   }
		  
		  @RequestMapping("/productDetail.do")
		  public ModelAndView productDetail(String no) throws Exception{
			  ModelAndView mv = new ModelAndView();
			  mv.addObject("productDetail",boardService.productDetail(no));
			  mv.setViewName("productDetail");
			  return mv;
		  }		  
		  
	   
		  @RequestMapping("/updateProduct.do")
		  public ModelAndView updateProduct(String pcode,
				  String pname, String price, String detail, String company , String classification , String amount) throws Exception{
			  HashMap<String, String> hashMap = new HashMap<String, String>();			  
			  hashMap.put("pcode",pcode);
			  hashMap.put("pname",pname);
			  hashMap.put("price",price);
			  hashMap.put("detail",detail);
			  hashMap.put("company",company);
			  hashMap.put("classification",classification);
			  hashMap.put("amount",amount);
			  boardService.updateProduct(hashMap);
			  return productDetail(pcode);
		  }		
	   
	   @RequestMapping("/deleteProduct.do")
	   public ModelAndView delteProduct(String pcode) throws Exception{
		 ModelAndView mv = new ModelAndView();
		 boardService.deleteProduct(pcode);
	     mv.setViewName("deleteProduct");
		 return mv;
	   }
	   
	}	   
////////////////////////////////////////////////////////////////////////////////////	   
	