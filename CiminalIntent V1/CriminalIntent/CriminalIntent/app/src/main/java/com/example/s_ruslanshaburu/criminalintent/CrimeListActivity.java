package com.example.s_ruslanshaburu.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by s-ruslan.shaburu on 2/12/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
