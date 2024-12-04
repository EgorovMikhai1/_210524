package com.app._18_11_2024;

public class RealController implements ProxyInter {

    @Override
    public void get() {
        System.out.println("Real Controller");
    }
}

class ProxyController implements ProxyInter {
    private RealController realController;

    public ProxyController(RealController realController) {
        this.realController = realController;
    }

    @Override
    public void get() {
        System.out.println("Proxy Controller");
        realController.get();
    }
}

interface ProxyInter {
    void get();
}

class Main {
    public static void main(String[] args) {

    }
}


