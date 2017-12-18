package com.tianxiabuyi.slider.SliderTypes;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tianxiabuyi.slider.R;

/**
 * This is a slider with a description TextView.
 */
public class TextSliderView extends BaseSliderView {

    private ImageView mIvSlide;
    private TextView mTvTitle;

    public TextSliderView(Context context) {
        super(context);
    }

    @Override
    public View getView() {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.slider_render_type_text, null);
        mIvSlide = (ImageView) v.findViewById(R.id.daimajia_slider_image);
        mTvTitle = (TextView) v.findViewById(R.id.description);
        mTvTitle.setMaxLines(1);
        mTvTitle.setEllipsize(TextUtils.TruncateAt.END);
        mTvTitle.setText(getDescription());
        bindEventAndShow(v, mIvSlide);
        return v;
    }

    public ImageView getSlideView() {
        return mIvSlide;
    }

    public TextView getTitleView() {
        return mTvTitle;
    }
}
