package cn.edu.nju.candleflame.architecturedemo.dagger.use;

import javax.inject.Inject;

public class Rose {
    @Inject
    public Rose(){

    }
    public String whisper(){
        return "热恋";
    }
}
