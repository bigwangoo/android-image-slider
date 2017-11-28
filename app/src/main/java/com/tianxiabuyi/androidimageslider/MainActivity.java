package com.tianxiabuyi.androidimageslider;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tianxiabuyi.slider.SliderLayout;
import com.tianxiabuyi.slider.SliderTypes.TextSliderView;

public class MainActivity extends AppCompatActivity {

    int[] res = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SliderLayout sliderLayout = (SliderLayout) findViewById(R.id.slider);

        for (int re : res) {
            TextSliderView sliderView = new TextSliderView(this);
            sliderView.image(re);
            sliderView.description("zzz");
            sliderLayout.addSlider(sliderView);
        }
        sliderLayout.setDuration(4000);
    }
}
