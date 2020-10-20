package com.StaticProxyDemo;

public class TestStaticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.happyMarry();
    }
}

interface Marry {
    void happyMarry();
}

class You implements Marry {
    @Override
    public void happyMarry() {
        System.out.println("要结婚啦，好开心");
    }
}

class WeddingCompany implements Marry {
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        before();
        this.target.happyMarry();
        after();
    }

    private void before() {
        System.out.println("结婚之前");
    }

    private void after() {
        System.out.println("结婚之后");
    }
}