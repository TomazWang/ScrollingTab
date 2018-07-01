package me.tomazwang.scrollingtab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.tomazwang.scrollingtab.model.TabItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<TabItem> mTabItemList = new ArrayList<>();
    private ScrollingTabAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView_scrollingTab_mainList);

        initData();
        initList();


    }

    private void initData() {

        // ---- test items
        mTabItemList.add(new TabItem("Facebook", R.drawable.icn_social_facebook_on_64, R.drawable.icn_social_facebook_off_64));
        mTabItemList.add(new TabItem("twitter", R.drawable.icn_social_twitter_on_64, R.drawable.icn_social_twitter_off_64));
        mTabItemList.add(new TabItem("youtube", R.drawable.icn_social_youtube_on_64, R.drawable.icn_social_youtube_off_64));

    }

    private void initList() {
        mAdapter = new ScrollingTabAdapter(mTabItemList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);

        layoutManager.scrollToPosition(mTabItemList.size() * ((mAdapter.getItemCount()/mTabItemList.size())/2) +1);

        LinearSnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(mRecyclerView);
    }





}
