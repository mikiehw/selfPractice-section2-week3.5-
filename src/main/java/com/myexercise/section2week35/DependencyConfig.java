package com.myexercise.section2week35;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyConfig {
    private MenuServiceStub menuServiceStub = new MenuServiceStub(); // 싱글톤 적용을 위해서 객체 생성해 두기.
    private MenuServiceImple menuServiceImple = new MenuServiceImple();  // 싱글톤 적용을 위해서 객체 생성해 두기.
    @Bean
    public MenuServiceStub getMenuServiceStub() {return menuServiceStub;}
    @Bean
    public MenuServiceImple getMenuServiceImple() {
        return menuServiceImple;
    }
    @Bean
    public MenuController getMenuController() {
        return new MenuController(getMenuServiceStub());
    }
}
