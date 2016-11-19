package in.zattack.personaldietician;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class DietTips extends AppCompatActivity {

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
        setContentView(R.layout.activity_diet_tips);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_diet_tips, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            if(getArguments().getInt(ARG_SECTION_NUMBER)==1)
                return inflater.inflate(R.layout.fragment_tip1, container, false);
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
                return inflater.inflate(R.layout.fragment_tip2, container, false);
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==3)
                return inflater.inflate(R.layout.fragment_tip3, container, false);
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==4)
                return inflater.inflate(R.layout.fragment_tip4, container, false);
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==5)
                return inflater.inflate(R.layout.fragment_tip5, container, false);
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==6)
                return inflater.inflate(R.layout.fragment_tip6, container, false);
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==7)
                return inflater.inflate(R.layout.fragment_tip7, container, false);
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==8)
                return inflater.inflate(R.layout.fragment_tip8, container, false);
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==9)
                return inflater.inflate(R.layout.fragment_tip9, container, false);
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==10)
                return inflater.inflate(R.layout.fragment_tip10, container, false);
            return inflater.inflate(R.layout.fragment_diet_tips, container, false);
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 10 total pages.
            return 10;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "One";
                case 1:
                    return "Two";
                case 2:
                    return "Three";
                case 3:
                    return "Four";
                case 4:
                    return "Five";
                case 5:
                    return "Six";
                case 6:
                    return "Seven";
                case 7:
                    return "Eight";
                case 8:
                    return "Nine";
                case 9:
                    return "Ten";
            }
            return null;
        }
    }
}
