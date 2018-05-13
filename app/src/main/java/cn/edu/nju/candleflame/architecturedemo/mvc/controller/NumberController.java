package cn.edu.nju.candleflame.architecturedemo.mvc.controller;

import cn.edu.nju.candleflame.architecturedemo.mvc.model.NumberModel;

public class NumberController {

    private NumberModel numberModel;

    public NumberController(){
        numberModel = new NumberModel();
    }

    public void plusOne(OnPlusListener listener){
        numberModel.Plus();
        if (listener != null) {
            listener.onComplete(numberModel);
        }
    }

    public void minusOne(OnMinusListener listener){
        numberModel.Minus();
        if (listener != null) {
            listener.onComplete(numberModel);
        }
    }

    public interface OnPlusListener {
        void onComplete(NumberModel numberModel);
    }

    public interface OnMinusListener {
        void onComplete(NumberModel numberModel);
    }

}
