package com.example.leo.textdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


/**
 * SimpleMenuActivity
 */
public class SimpleMenuActivtiy extends AppCompatActivity {
    private BirdGridFragment birdGridFragment;
    private SimpleSlidingMenu slindMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        slindMenu= (SimpleSlidingMenu) findViewById(R.id.id_slidingmenu);
        setTitle(getIntent().getStringExtra("title"));
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.id_simple_menu,new SampleListFragment());
        ft.replace(R.id.id_simple_content,birdGridFragment=new BirdGridFragment());
        ft.commit();
    }
    public void toggle(View view){
        slindMenu.toggle();
    }
}
