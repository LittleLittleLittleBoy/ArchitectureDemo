package cn.edu.nju.candleflame.architecturedemo.mvvm;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

// View Model
public class SimpleCal extends BaseObservable{

    private Model model ;

    public String number ;

    public SimpleCal() {
        this.model = new Model() ;
        this.number = Integer.toString(model.getData());    //访问model 数据层
    }

    public void setNumber(int number) {
        this.number=Integer.toString(number) ;
        notifyChange();
    }

    @Bindable
    public String getNumber() {
        return Integer.toString(model.getData());   //展示逻辑部分
    }

    //业务逻辑操作
    public void addOne() {
        model.addOne(this);
    }


    public void minorOne() {
        model.minorOne(this);
    }


}
