package cn.edu.nju.candleflame.architecturedemo.mvc.model;

import cn.edu.nju.candleflame.architecturedemo.mvc.bean.NumberBean;
import cn.edu.nju.candleflame.architecturedemo.mvc.view.MVCFragment;

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

    public void Plus(MVCFragment.onPlusListener listener){
        number.setNum(number.getNum()+1);
        if (listener != null) {
            listener.onComplete(this);
        }
    }
    public void Minus(MVCFragment.onMinusListener listener){
        number.setNum(number.getNum()-1);
        if (listener != null) {
            listener.onComplete(this);
        }
    }
}
