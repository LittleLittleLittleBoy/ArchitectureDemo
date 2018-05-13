package cn.edu.nju.candleflame.architecturedemo.dagger.unuse;
import javax.inject.Inject;

public class Pot {

    private Rose rose;

    @Inject
    public Pot(Rose rose){
        this.rose=rose;
    }

    public String show(){
        return rose.whisper();
    }
}
