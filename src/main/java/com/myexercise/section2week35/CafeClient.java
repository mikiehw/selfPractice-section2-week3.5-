package com.myexercise.section2week35;

import java.util.List;

public class CafeClient {
    MenuServiceImple menuServiceImple = new MenuServiceImple();  // 1. 객체를 생성해서,
    MenuServiceStub menuServiceStub = new MenuServiceStub();  // 1. 객체를 생성해서,
    MenuController menuController = new MenuController(menuServiceImple); // 2. 객체를 주입함. *의존성 주입,
    // 이때 menuServiceImple 객체를 주입해도 되고, menuServiceStub 객체를 주입해도 문제없음.(인터페이스 다형성)
    List<String> menuList = menuController.getMenuList();
}