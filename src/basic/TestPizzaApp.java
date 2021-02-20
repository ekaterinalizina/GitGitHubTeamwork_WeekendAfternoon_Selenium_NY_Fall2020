package basic;

import Pizza.AppTest;

public class TestPizzaApp {
    public static void main(String[] args) {
        String cmodel="Hp";
        String lmodel="Acer";
        String pmodel="Acer";
        String vendor="IBM";
        String ver="2.0";
        int  lver= 10;
        int var =2021;
        int val=15;

        AppTest test=new AppTest();
        AppTest test1=new AppTest(var);
        AppTest test2=new AppTest(var,val);
        AppTest test3=new AppTest(var,val,cmodel,vendor);

        AppTest.computer(cmodel);
        AppTest.laptop(lmodel,lver);
        AppTest.phone(pmodel);


    }
}
