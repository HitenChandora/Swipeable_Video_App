package com.example.swipeup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ViewPager2 viewPager2;
    ArrayList<video> videos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        viewPager2 = (ViewPager2)findViewById(R.id.viewpager);
        videos = new ArrayList<>();

        video obj1 = new video("https://media.istockphoto.com/videos/wasp-collects-nectar-from-red-flowers-video-id1212401731","Title1","Description1");
        videos.add(obj1);

        video obj2 = new video("https://media.istockphoto.com/videos/kitesurfing-le-morne-mauritius-drone-view-flying-backwards-in-front-video-id1380489968","Title2","Description2");
        videos.add(obj2);

        video obj3 = new video("https://media.istockphoto.com/videos/hot-steel-rail-on-a-conveyor-in-a-metallurgical-plant-video-id1165763939","Title13","Description3");
        videos.add(obj3);

        video obj4= new video("https://media.istockphoto.com/videos/two-wild-roe-deer-grazing-in-a-field-video-id1255513417","Title1","Description4");
        videos.add(obj4);

        viewPager2.setAdapter(new videoAdapter(videos));
    }
}