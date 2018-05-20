package com.betterjourney.android.pilot;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.betterjourney.android.pilot.ui.journeys.JourneysViewFragment;
import com.betterjourney.android.pilot.ui.home.HomeViewFragment;
import com.betterjourney.android.pilot.ui.messages.MessagesViewFragment;

public class AppActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home_view:
//                    mTextMessage.setText(R.string.title_home);
                    selectedFragment = HomeViewFragment.newInstance();
                    break;
                case R.id.navigation_messages_view:
                    //mTextMessage.setText(R.string.title_messages);
                    selectedFragment = MessagesViewFragment.newInstance();
                    break;
                case R.id.navigation_journeys_view:
                    //mTextMessage.setText(R.string.title_journeys);
                    selectedFragment = JourneysViewFragment.newInstance();
                    break;
            }
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_frame_layout, selectedFragment);
            fragmentTransaction.commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation_bottom_view);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_frame_layout, HomeViewFragment.newInstance());
        fragmentTransaction.commit();
    }

}
