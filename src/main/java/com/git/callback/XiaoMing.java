package com.git.callback;

public class XiaoMing implements EatRice{
    //小明和小李一起吃饭
    public void eatFood() {
        XiaoLi xl = new XiaoLi();
        //A调用B的方法
        xl.setEatRiceListener(this, "大龙虾");
    }

    @Override
    public void eat(String food) {
        // TODO Auto-generated method stub
        System.out.print("小明和小李一起去吃" + food);
    }

}
