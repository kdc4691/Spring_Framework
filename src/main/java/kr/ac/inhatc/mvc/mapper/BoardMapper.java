package kr.ac.inhatc.mvc.mapper;

import java.util.HashMap;
import java.util.List;

import kr.ac.inhatc.mvc.dto.BoardDto;

public interface BoardMapper {
   public HashMap productDetail(String no) throws Exception; 
   public int updateProduct(HashMap<String, String> map) throws Exception;
   public List<?> shop(String keyword, String condition) throws Exception;
   public int registUser(HashMap<String, String> map) throws Exception;
   public List<?> login(String inputUserName) throws Exception;
   public int registProduct(HashMap<String, String> map) throws Exception;
   public List<?> products() throws Exception;

   public int deleteProduct(String pcode) throws Exception; 
   
   public String getName() throws Exception;
   public List<?> selectSubjectList(String keyword, String condition, int page) throws Exception;
   public HashMap selectSubjectOne(String no) throws Exception;
   public int modifyBoardDetail(HashMap<String, String> map) throws Exception;
   public int deleteBoardDetail(String no) throws Exception; 
   
   public HashMap Paging(String page) throws Exception;
}