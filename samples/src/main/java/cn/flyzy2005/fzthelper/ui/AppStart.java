package cn.flyzy2005.fzthelper.ui;

import android.view.animation.Animation;
import android.widget.Toast;

import cn.flyzy2005.fzthelper.R;
import cn.flyzy2005.fztutil.ui.AbstractWelcomeActivity;

/**
 * Created by Fly on 2017/4/28.
 */

public class AppStart extends AbstractWelcomeActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_start;
    }

    @Override
    protected Animation.AnimationListener getListener() {
        return new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(AppStart.this, "动画开始啦", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(AppStart.this, "动画结束啦", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        };
    }

    @Override
    protected void setDuration() {
        durationTime = 800;
    }
}