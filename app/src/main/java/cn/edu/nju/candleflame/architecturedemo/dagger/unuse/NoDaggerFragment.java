package cn.edu.nju.candleflame.architecturedemo.dagger.unuse;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.edu.nju.candleflame.architecturedemo.R;

public class NoDaggerFragment extends Fragment {

    private View rootView;
    private Pot pot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_nodaggerdemo, container, false);

        this.rootView=rootView;
        init();
        return rootView;
    }

    private void init() {

        Rose rose=new Rose();
        pot=new Pot(rose);

        String show=pot.show();

        TextView textView=rootView.findViewById(R.id.undagger_text);
        textView.setText("NoDagger"+show);

    }


}
