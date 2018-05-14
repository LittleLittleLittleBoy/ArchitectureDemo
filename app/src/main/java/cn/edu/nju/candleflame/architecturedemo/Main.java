package cn.edu.nju.candleflame.architecturedemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import cn.edu.nju.candleflame.architecturedemo.dagger.unuse.NoDaggerFragment;
import cn.edu.nju.candleflame.architecturedemo.dagger.use.DaggerFragment;
import cn.edu.nju.candleflame.architecturedemo.frp.FrpFragment;
import cn.edu.nju.candleflame.architecturedemo.mvc.view.MVCFragment;
import cn.edu.nju.candleflame.architecturedemo.mvp.view.MVPFragment;
import cn.edu.nju.candleflame.architecturedemo.mvvm.view.MvvmFragment;

public class Main extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);

            this.fragmentList.add(new MVCFragment());
            this.fragmentList.add(new MVPFragment());
            this.fragmentList.add(new MvvmFragment());
            this.fragmentList.add(new FrpFragment());
            this.fragmentList.add(new NoDaggerFragment());
            this.fragmentList.add(new DaggerFragment());

        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {

            return fragmentList.size();
        }
    }
}
