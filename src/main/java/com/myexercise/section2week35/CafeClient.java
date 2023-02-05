package com.myexercise.section2week35;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CafeClient {
    public static void main(String[] args) {
        // 예전 코드
//        MenuService menuService = new MenuServiceImple();
//        MenuController menuController1 = new MenuController(menuService);
//        List<String> menuList1 = menuController1.getMenuList();
//        System.out.println(menuList1);

        // 설정파일(Comfig)를 적용한 코드
//        DependencyConfig dependencyConfig = new DependencyConfig();
//        MenuController menuController = dependencyConfig.getMenuController();
//        List<String> menuList = menuController.getMenuList();
//        System.out.println(menuList);

        //스프링 적용... @Bean 으로 빈 등록하기!
        ApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
        MenuController menuController = ac.getBean(MenuController.class);
        List<String> menuList = menuController.getMenuList();
        System.out.println(menuList);
    }
}