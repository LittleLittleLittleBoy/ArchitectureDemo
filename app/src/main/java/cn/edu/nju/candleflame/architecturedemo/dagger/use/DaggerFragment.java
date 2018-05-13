package cn.edu.nju.candleflame.architecturedemo.dagger.use;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import cn.edu.nju.candleflame.architecturedemo.R;

public class DaggerFragment extends Fragment {

    private View rootView;

    @Inject
    Pot pot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_daggerdemo, container, false);

        this.rootView=rootView;
        init();
        return rootView;
    }

    private void init() {



        TextView textView=rootView.findViewById(R.id.dagger_text);
        DaggerMainActivityComponent.create().inject(this);
        String show=pot.show();

        textView.setText("Dagger:"+show);

    }
}
