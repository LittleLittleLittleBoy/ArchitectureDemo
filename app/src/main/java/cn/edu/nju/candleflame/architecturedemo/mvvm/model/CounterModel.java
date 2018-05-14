package cn.edu.nju.candleflame.architecturedemo.mvvm.model;

import cn.edu.nju.candleflame.architecturedemo.mvvm.bean.MyTime;
import cn.edu.nju.candleflame.architecturedemo.mvvm.viewmodel.SimpleCal;

public class CounterModel {

    public int getYear() {
        return MyTime.year;
    }

    public void setYear(int year) {
        MyTime.year = year ;
    }

    public void addOne(SimpleCal sc){
        int i = Integer.parseInt(sc.number) ;
        i++ ;
        setYear(i);
        sc.setNumber(i) ;
    }

    public void minorOne(SimpleCal sc){
        int i = Integer.parseInt(sc.number) ;
        i-- ;
        setYear(i);
        sc.setNumber(i) ;
    }


}


