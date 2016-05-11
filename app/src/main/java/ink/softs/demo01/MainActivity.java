package ink.softs.demo01;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPager;
    private ArrayList<Fragment> fragments;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        initView();

        manager = getSupportFragmentManager();
        MyAdapter myAdapter = new MyAdapter(manager, fragments);
        viewPager.setAdapter(myAdapter);
    }

    private void initData() {
        fragments = new ArrayList<>();

        fragments.add(new RwlFragment());
        fragments.add(new GFragment());
        fragments.add(new LFragment());
    }

    private void initView() {

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                viewPager.setCurrentItem(0);
                break;
            case R.id.btn_2:
                viewPager.setCurrentItem(1);
                break;
            case R.id.btn_3:
                viewPager.setCurrentItem(2);
                break;
        }
    }
}
