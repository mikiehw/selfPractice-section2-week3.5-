package com.myexercise.section2week35;

import java.util.List;

public class CafeClient {
    MenuController menuController = new MenuController();
    List<String> menuList = menuController.getMenuList();
}