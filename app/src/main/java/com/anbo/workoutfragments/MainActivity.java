package com.anbo.workoutfragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.WorkoutListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Head first 2nd, chapter 9
//        FragmentManager fragmentManager = getFragmentManager();
//        WorkoutDetailFragment frag =
//                (WorkoutDetailFragment) fragmentManager.findFragmentById(R.id.detail_frag);
//        frag.setWorkoutId(1);
    }

    // Head First chapter 10
    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.frament_container);
        if (fragmentContainer != null) {
            WorkoutDetailFragment details = new WorkoutDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWorkoutId(id);
            ft.replace(R.id.frament_container, details);
            final String name = null;
            ft.addToBackStack(name);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int) id);
            startActivity(intent);
        }
    }
}
