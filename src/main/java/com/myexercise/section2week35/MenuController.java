package com.myexercise.section2week35;

import java.util.List;

public class MenuController {
    MenuService menuService;
    public MenuController(MenuService menuService) { // 객체를 주입 받기 위한 생성자 작성.
        this.menuService = menuService;
    }
    public List<String> getMenuList() {
        return menuService.getMenuList();
    }
}
