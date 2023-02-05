package com.myexercise.section2week35;

import java.util.List;

public class MenuController {
    MenuService menuService = new MenuService();
    public List<String> getMenuList() {
        return menuService.getMenuList();
    }
}
