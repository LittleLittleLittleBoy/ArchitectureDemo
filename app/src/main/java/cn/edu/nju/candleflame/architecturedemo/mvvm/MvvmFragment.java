package cn.edu.nju.candleflame.architecturedemo.mvvm;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import cn.edu.nju.candleflame.architecturedemo.databinding.FragmentMvvmdemoBinding;

import cn.edu.nju.candleflame.architecturedemo.R;


public class MvvmFragment extends Fragment implements View.OnClickListener {

    private View rootView;

    SimpleCal simpleCal  ;  // View Model




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentMvvmdemoBinding binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_mvvmdemo, container, false);

        simpleCal=new SimpleCal();

        binding.setSc(simpleCal);
        this.rootView=binding.getRoot();

        Button addButton= rootView.findViewById(R.id.mvvm_add);
        addButton.setOnClickListener(this);
        Button subButton=rootView.findViewById(R.id.mvvm_sub);
        subButton.setOnClickListener(this);

        return binding.getRoot();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mvvm_add:
                simpleCal.addOne();
                break;
            case R.id.mvvm_sub:
                simpleCal.minorOne();
                break;
        }
    }


}
