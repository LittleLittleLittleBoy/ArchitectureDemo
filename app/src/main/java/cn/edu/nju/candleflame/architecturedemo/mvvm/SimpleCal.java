package cn.edu.nju.candleflame.architecturedemo.mvvm;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

// View Model
public class SimpleCal extends BaseObservable{

    private Model model ;

    public String number ;

    public String type;


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

    @Bindable("number")
    public String getType(){
        if (model.getData()%400==0){
            return "闰年";
        }else if (model.getData()%100==0){
            return "普通年";
        }else if (model.getData()%4==0){
            return "闰年";
        }else{
            return "普通年";
        }
    }

    //业务逻辑操作
    public void addOne() {
        model.addOne(this);
    }


    public void minorOne() {
        model.minorOne(this);
    }


}
