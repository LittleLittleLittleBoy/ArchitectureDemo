package cn.edu.nju.candleflame.architecturedemo.mvc.model;

import cn.edu.nju.candleflame.architecturedemo.mvc.bean.NumberBean;

public class NumberModel {

    NumberBean number;

    public NumberModel(){
        number = new Number();
    }

    public int getNum(){
        return number.getNum();
    }
    public void setNum(int num){
        number.setNum(num);
    }

    public void Plus(MainActivity.onPlusListener listener){
        number.setNum(number.getNum()+1);
        if (listener != null) {
            listener.onComplete(this);
        }
    }
    public void Minus(MainActivity.onMinusListener listener){
        number.setNum(number.getNum()-1);
        if (listener != null) {
            listener.onComplete(this);
        }
    }
}
