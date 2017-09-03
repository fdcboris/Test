package android.goodrun.com.testwebview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter( new PagerTest(this.getSupportFragmentManager()));

    }


    public class PagerTest extends FragmentStatePagerAdapter{

        public PagerTest(FragmentManager fm){ super(fm);}
        @Override
        public Fragment getItem(int position) {
            return  Game.newInstance();
        }

        @Override
        public int getCount() {
            return 30;
        }
    }


}
