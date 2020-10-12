package com.GenericDemo;

public class MyGenericInterfaceImpl implements MyGenericInterface<String> {

    @Override
    public String server(String t) {
        System.out.println(t);
        return t;
    }
}
