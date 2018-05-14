package cn.edu.nju.candleflame.architecturedemo.mvvm.viewmodel;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import cn.edu.nju.candleflame.architecturedemo.mvvm.model.CalendarModel;
import cn.edu.nju.candleflame.architecturedemo.mvvm.model.CounterModel;

// View CounterModel
public class SimpleCal extends BaseObservable{

    private CounterModel counterModel;
    private CalendarModel calendarModel ;

    public String number ;
    public String type;


    public SimpleCal() {
        this.counterModel = new CounterModel() ;
        this.calendarModel = new CalendarModel() ;
        this.number = getNumber() ;
    }

    public void setNumber(int number) {
        this.number=Integer.toString(number) ;
        notifyChange();
    }

    @Bindable
    public String getNumber() {
        return Integer.toString(counterModel.getYear());   //展示逻辑
    }

    @Bindable("number")
    public String getType(){
        return calendarModel.getType() ;
    }

    //业务逻辑操作
    public void addOne() {
        counterModel.addOne(this);
    }


    public void minorOne() {
        counterModel.minorOne(this);
    }


}
