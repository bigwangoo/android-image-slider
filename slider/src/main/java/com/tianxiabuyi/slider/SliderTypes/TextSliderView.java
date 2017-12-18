package com.tianxiabuyi.slider.SliderTypes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tianxiabuyi.slider.R;

/**
 * This is a slider with a description TextView.
 */
public class TextSliderView extends BaseSliderView {

    public TextSliderView(Context context) {
        super(context);
    }

    @Override
    public View getView() {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.slider_render_type_text, null);
        ImageView ivSlide = (ImageView) v.findViewById(R.id.daimajia_slider_image);
        TextView tvDesc = (TextView) v.findViewById(R.id.description);
        tvDesc.setText(getDescription());
        bindEventAndShow(v, ivSlide);
        return v;
    }
}
