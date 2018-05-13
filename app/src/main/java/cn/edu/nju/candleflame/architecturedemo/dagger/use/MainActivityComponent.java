package cn.edu.nju.candleflame.architecturedemo.dagger.use;
import dagger.Component;

@Component
public interface MainActivityComponent {
    void inject(DaggerFragment fragment);
}
