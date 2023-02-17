package com.greedy.section02.javaconfig;

import java.util.List;

public class PrintResult {

	public void printMenuList(List<MenuDTO> menuList) {
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
	}
	
	public void printMenu(MenuDTO menu) {
		System.out.println(menu);
	}

	public void printErrorMessage(String errorCode) {
		String errorMessage = "";
		switch(errorCode) {
		case "selectList" : errorMessage = "메뉴 목록 조회에 실패하였습니다."; break;
		case "selectOne" : errorMessage = "메뉴 조회에 실패하였습니다."; break;
		case "insert" : errorMessage = "메뉴 등록에 실패하였습니다."; break;
		case "update" : errorMessage = "메뉴 수정에 실패하였습니다."; break;
		case "delete" : errorMessage = "메뉴 삭제에 실패하였습니다."; break;
		}
		
		System.out.println(errorMessage);
	}

	public void printSuccessMessage(String successCode) {
		String successMessage = "";
		switch(successCode) {
		case "insert" : successMessage = "메뉴 등록에 성공하였습니다."; break;
		case "update" : successMessage = "메뉴 수정에 성공하였습니다."; break;
		case "delete" : successMessage = "메뉴 삭제에 성공하였습니다."; break;
		}
		
		System.out.println(successMessage);
		
	}


}




