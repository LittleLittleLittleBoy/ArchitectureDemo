package cn.edu.nju.candleflame.architecturedemo.mvvm;


//数据模型
public class Model {

    private int data = 2018 ;

    public int getData() {
        return this.data ;
    }

    public void setData(int data) {
        this.data = data ;
    }

    public void addOne(SimpleCal sc){
        int i = Integer.parseInt(sc.number) ;
        i++ ;
        setData(i);
        sc.setNumber(i) ;
    }

    public void minorOne(SimpleCal sc){
        int i = Integer.parseInt(sc.number) ;
        i-- ;
        setData(i);
        sc.setNumber(i) ;
    }
}

