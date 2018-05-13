package cn.edu.nju.candleflame.architecturedemo.mvp.model;

import cn.edu.nju.candleflame.architecturedemo.mvp.bean.NumberBean;

public class NumberModel {

    NumberBean number;

    public NumberModel(){
        number = new NumberBean();
    }

    public int getNum(){
        return number.getNum();
    }
    public void setNum(int num){
        number.setNum(num);
    }

    public void Plus(){
        number.setNum(number.getNum()+1);
    }
    public void Minus(){
        number.setNum(number.getNum()-1);
    }
}
