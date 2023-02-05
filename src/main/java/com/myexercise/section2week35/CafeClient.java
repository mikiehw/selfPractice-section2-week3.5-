package com.myexercise.section2week35;

import java.util.List;

public class CafeClient {
    MenuService menuService = new MenuService();  // 1. 객체를 생성해서,
    MenuController menuController = new MenuController(menuService); // 2. 객체를 주입함.*의존성 주입
    List<String> menuList = menuController.getMenuList();
}