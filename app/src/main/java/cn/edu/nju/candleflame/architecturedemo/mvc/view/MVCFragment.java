package cn.edu.nju.candleflame.architecturedemo.mvc.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cn.edu.nju.candleflame.architecturedemo.R;
import cn.edu.nju.candleflame.architecturedemo.mvc.controller.NumberController;
import cn.edu.nju.candleflame.architecturedemo.mvc.model.NumberModel;

public class MVCFragment extends Fragment implements View.OnClickListener {

    private NumberController numberController;
    private View rootview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mvcdemo, container, false);

        numberController = new NumberController();

        NumberModel numberModel = new NumberModel();
        TextView textView = (TextView)rootView.findViewById(R.id.mvc_number);
        textView.setText(String.valueOf(numberModel.getNum()));

        Button btn_plus = (Button)rootView.findViewById(R.id.mvc_add);
        btn_plus.setOnClickListener(this);
        Button btn_minus = (Button)rootView.findViewById(R.id.mvc_sub);
        btn_minus.setOnClickListener(this);

        this.rootview=rootView;
        return rootView;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mvc_add:
                numberController.plusOne(new onPlusListener() {
                    @Override
                    public void onComplete(NumberModel numberModel) {
                        TextView textView = (TextView)rootview.findViewById(R.id.mvc_number);
                        textView.setText(String.valueOf(numberModel.getNum()));
                    }
                });
                break;
            case R.id.mvc_sub:
                numberController.minusOne(new onMinusListener() {
                    @Override
                    public void onComplete(NumberModel numberModel) {
                        TextView textView = (TextView)rootview.findViewById(R.id.mvc_number);
                        textView.setText(String.valueOf(numberModel.getNum()));
                    }
                });
                break;
        }
    }

    public interface onPlusListener {
        void onComplete(NumberModel numberModel);
    }

    public interface onMinusListener {
        void onComplete(NumberModel numberModel);
    }
}
