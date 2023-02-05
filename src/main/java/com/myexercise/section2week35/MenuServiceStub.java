package com.myexercise.section2week35;

import org.springframework.stereotype.Component;

import java.util.List;
public class MenuServiceStub implements MenuService{
    public List<String> getMenuList() {
        return List.of(
                new String("아메리카노"),
                new String("아이스티"),
                new String("카페라떼")
        );
    }
}
