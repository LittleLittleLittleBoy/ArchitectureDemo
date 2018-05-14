package cn.edu.nju.candleflame.architecturedemo.mvvm.model;

import cn.edu.nju.candleflame.architecturedemo.mvvm.bean.MyTime;

public class CalendarModel {

    public String getType() {
        judgeLeapYear();

        if(MyTime.isLeapYear)
            return "闰年";
        else
            return "平年" ;
    }

    public void judgeLeapYear() {
        if (MyTime.year%400==0){
            MyTime.isLeapYear = true;
        }else if (MyTime.year%100==0){
            MyTime.isLeapYear = false;
        }else if (MyTime.year%4==0){
            MyTime.isLeapYear = true;
        }else{
            MyTime.isLeapYear = false;
        }
    }

}
