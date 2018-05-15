package cn.edu.nju.candleflame.architecturedemo.mvc.controller;

import cn.edu.nju.candleflame.architecturedemo.mvc.model.NumberModel;

public class NumberController {

    private NumberModel numberModel;

    public NumberController(){
        numberModel = new NumberModel();
    }

    public void plusOne(MVCFragment.onPlusListener listener){
        numberModel.Plus(listener);
    }

    public void minusOne(MVCFragment.onMinusListener listener){
        numberModel.Minus(listener);

    }
}
