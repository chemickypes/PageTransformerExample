package it.hooloovoo.angelo.pagetransformerexample;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by angelo on 18/09/14.
 */
public class RotationPageTransformer implements ViewPager.PageTransformer {


    @Override
    public void transformPage(View page, float position) {
            page.setRotationY(position * -30 );

    }
}
