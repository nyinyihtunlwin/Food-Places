package projects.nyinyihtunlwin.foodplaces.viewitems;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import butterknife.ButterKnife;
import projects.nyinyihtunlwin.foodplaces.R;
import projects.nyinyihtunlwin.foodplaces.data.vo.FeaturedVO;

/**
 * Created by Dell on 1/6/2018.
 */

public class FoodPlaceImageSlideViewItem extends FrameLayout {

    @BindView(R.id.iv_image_slide)
    ImageView ivFoodPlaceImage;

    @BindView(R.id.tv_featured_title)
    TextView tvFeaturedTitle;

    public FoodPlaceImageSlideViewItem(@NonNull Context context) {
        super(context);
    }

    public FoodPlaceImageSlideViewItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FoodPlaceImageSlideViewItem(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this, this);
    }

    public void setData(FeaturedVO featuredVO, Context context) {

        tvFeaturedTitle.setText(featuredVO.getFeaturedTitle());

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_placeholder)
                .centerCrop();
        Glide.with(context).load(featuredVO.getFeaturedImage()).apply(requestOptions).into(ivFoodPlaceImage);


    }
}
