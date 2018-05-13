package cn.edu.nju.candleflame.architecturedemo.mvp.view;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cn.edu.nju.candleflame.architecturedemo.R;
import cn.edu.nju.candleflame.architecturedemo.mvp.presenter.NumberPresenter;

public class MVPFragment extends Fragment implements IMVPFragment,View.OnClickListener {

    private NumberPresenter numberPresenter;
    private TextView numText;
    private TextView loadingText;
    private View rootview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mvpdemo, container, false);

        Button btn_plus = (Button)rootView.findViewById(R.id.mvp_add);
        btn_plus.setOnClickListener(this);
        Button btn_minus = (Button)rootView.findViewById(R.id.mvp_sub);
        btn_minus.setOnClickListener(this);

        numText = (TextView)rootView.findViewById(R.id.mvp_number);

        loadingText=(TextView)rootView.findViewById(R.id.mvp_loading);

        numberPresenter = new NumberPresenter(this);
        numberPresenter.loadNumber();

        this.rootview=rootView;
        return rootView;
    }

    @Override
    public void showNumber(int num) {
        numText.setText(String.valueOf(num));
    }

    @Override
    public void showLoading() {
        loadingText.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissLoading() {
        loadingText.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mvp_add:
                numberPresenter.PlusOne();
                break;
            case R.id.mvp_sub:
                numberPresenter.MinusOne();
                break;
        }
    }
}
