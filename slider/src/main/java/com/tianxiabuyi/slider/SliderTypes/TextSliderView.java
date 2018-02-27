package com.tianxiabuyi.slider.SliderTypes;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
        LinearLayout descriptionLayout = (LinearLayout) v.findViewById(R.id.description_layout);
        TextView tvDesc = (TextView) v.findViewById(R.id.description);
        if (TextUtils.isEmpty(getDescription())) {
            descriptionLayout.setVisibility(View.GONE);
        } else {
            tvDesc.setText(getDescription());
        }
        bindEventAndShow(v, ivSlide);
        return v;
    }
}
