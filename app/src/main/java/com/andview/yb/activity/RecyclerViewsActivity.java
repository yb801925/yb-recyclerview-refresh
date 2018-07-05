package com.andview.yb.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.andview.yb.R;
import com.andview.yb.activity.recyclerview.BannerRecyclerViewActivity;
import com.andview.yb.activity.recyclerview.GridRecyclerViewActivity;
import com.andview.yb.activity.recyclerview.LinearRecyclerViewActivity;
import com.andview.yb.activity.recyclerview.MultiItemRecyclerViewActivity;
import com.andview.yb.activity.recyclerview.ShowFooterWhenNoMoreDataRecyclerViewActivity;
import com.andview.yb.activity.recyclerview.SilenceRecyclerViewActivity;
import com.andview.yb.activity.recyclerview.StaggeredRecyclerViewActivity;
import com.andview.yb.activity.recyclerview.WithoutBaseAdapterRecyclerViewActivity;
/**
 * @author yangbo
 */
public class RecyclerViewsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerviews);
    }

    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.bt_linear:
                intent = new Intent(this, LinearRecyclerViewActivity.class);
                break;
            case R.id.bt_grid:
                intent = new Intent(this, GridRecyclerViewActivity.class);
                break;
            case R.id.bt_staggered:
                intent = new Intent(this, StaggeredRecyclerViewActivity.class);
                break;
            case R.id.bt_banner:
                intent = new Intent(this, BannerRecyclerViewActivity.class);
                break;
            case R.id.bt_slience:
                intent = new Intent(this, SilenceRecyclerViewActivity.class);
                break;
            case R.id.bt_multi_item:
                intent = new Intent(this, MultiItemRecyclerViewActivity.class);
                break;
            case R.id.bt_without_baseRecyclerAdapter:
                intent = new Intent(this, WithoutBaseAdapterRecyclerViewActivity.class);
                break;
            case R.id.bt_showFooter_noMoreData:
                intent = new Intent(this, ShowFooterWhenNoMoreDataRecyclerViewActivity.class);
                break;
            default:
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }

    }
}
