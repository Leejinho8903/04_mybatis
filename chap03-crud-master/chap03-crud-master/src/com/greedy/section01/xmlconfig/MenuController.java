package com.greedy.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {

	private final MenuService menuService;
	private final PrintResult printResult;
	
	public MenuController() {
		menuService = new MenuService();
		printResult = new PrintResult();
	}
	
	public void selectAllMenu() {
		
		List<MenuDTO> menuList = menuService.selectAllMenu();
		
		if(menuList != null) {
			printResult.printMenuList(menuList);
		} else {
			printResult.printErrorMessage("selectList");
		}
		
	}

	public void selectMenuByCode(Map<String, String> parameter) {
		
		int code = Integer.parseInt(parameter.get("code"));
		
		MenuDTO menu = menuService.selectMenuByCode(code);
		
		if(menu != null) {
			printResult.printMenu(menu);
		} else {
			printResult.printErrorMessage("selectOne");
		}
		
	}

	public void registMenu(Map<String, String> parameter) {
		
		MenuDTO menu = new MenuDTO();
		menu.setMenuName(parameter.get("name"));
		menu.setMenuPrice(Integer.parseInt(parameter.get("price")));
		menu.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));
		
		if(menuService.registMenu(menu)) {
			printResult.printSuccessMessage("insert");
		} else {
			printResult.printErrorMessage("insert");
		}
	
	}

	public void modifyMenu(Map<String, String> parameter) {
		
		MenuDTO menu = new MenuDTO();
		menu.setMenuCode(Integer.parseInt(parameter.get("code")));
		menu.setMenuName(parameter.get("name"));
		menu.setMenuPrice(Integer.parseInt(parameter.get("price")));
		menu.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));
		
		if(menuService.modifyMenu(menu)) {
			printResult.printSuccessMessage("update");
		} else {
			printResult.printErrorMessage("update");
		}
		
	}

	public void deleteMenu(Map<String, String> parameter) {
		
		int code = Integer.parseInt(parameter.get("code"));
		
		if(menuService.deleteMenu(code)) {
			printResult.printSuccessMessage("delete");
		} else {
			printResult.printErrorMessage("delete");
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
