package com.myexercise.section2week35;

public class DependencyConfig {
    private MenuServiceStub menuServiceStub = new MenuServiceStub(); // 싱글톤 적용을 위해서 객체 생성해 두기.
    private MenuServiceImple menuServiceImple = new MenuServiceImple();  // 싱글톤 적용을 위해서 객체 생성해 두기.

    public MenuServiceStub getMenuServiceStub() {return menuServiceStub;}
    public MenuServiceImple getMenuServiceImple() {
        return menuServiceImple;
    }
    public MenuController getMenuController() {
        return new MenuController(getMenuServiceStub());
    }
}
