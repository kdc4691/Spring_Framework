package kr.ac.inhatc.mvc.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.inhatc.mvc.dto.BoardDto;
import kr.ac.inhatc.mvc.mapper.BoardMapper;

@Service
public class BoardService {
   @Autowired
   BoardMapper board;
   
   public HashMap productDetail(String no) throws Exception{
	      return board.productDetail(no);
	}

   public int updateProduct(HashMap<String, String> map) throws Exception{
  	   return board.updateProduct(map);
   }
   
   public List<?> shop(String searchKeyword, String searchCondition) throws Exception{
	      return board.shop(searchKeyword, searchCondition);   
   }
   
   public int registUser(HashMap<String, String> map) throws Exception{
	   return board.registUser(map);
   }
   
   public List<?> login(String inputUserName) throws Exception{
	      return board.login(inputUserName);   
   } 

   
   public int registProduct(HashMap<String, String> map) throws Exception{
	   return board.registProduct(map);
   }
      
   public List<?> products() throws Exception{
	      return board.products();   
   }
   
   
   
   public int deleteProduct(String pcode) throws Exception{
	   return board.deleteProduct(pcode);
   }
   
}
///////////////////////////////////////////////////////////////////////////////
   
   
 