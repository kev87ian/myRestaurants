package com.kev.myrestaurants;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)

public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup(){
        activity = Roboelectric.setupActivity(MainActivity.class);
    }

}
