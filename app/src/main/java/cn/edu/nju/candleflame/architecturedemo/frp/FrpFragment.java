package cn.edu.nju.candleflame.architecturedemo.frp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jakewharton.rxbinding2.view.RxView;

import cn.edu.nju.candleflame.architecturedemo.R;
import io.reactivex.functions.Consumer;

public class FrpFragment extends Fragment{

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_frpdemo, container, false);

        this.rootView=rootView;
        init();
        return rootView;
    }

    @SuppressLint("CheckResult")
    private void init() {
        //The code that I add
        Button Add = rootView.findViewById(R.id.frp_add);
        Button Sub = rootView.findViewById(R.id.frp_sub);
        final TextView textView = rootView.findViewById(R.id.frp_number);

        RxView.clicks(Add).subscribe(new Consumer<Object>() {
            @Override
            public void accept(Object o)  {
                String content = String.valueOf(textView.getText());
                Log.i("tag", content);
                int number = Integer.parseInt(content.split(" ")[1]);
                number++;
                textView.setText("Number: " + number);
            }
        });
        RxView.clicks(Sub).subscribe(new Consumer<Object>() {


            @Override
            public void accept(Object o) {
                String content = String.valueOf(textView.getText());
                Log.i("tag", content);
                int number = Integer.parseInt(content.split(" ")[1]);
                number--;
                textView.setText("Number: " + number);
            }

        });
    }

}
