package me.tomazwang.scrollingtab.model;

import android.support.annotation.DrawableRes;

import me.tomazwang.scrollingtab.R;

/**
 * Created by TomazWang on 2017/3/10.
 */

public class TabItem {
    private static final String TAG = TabItem.class.getSimpleName();

    String tabName;
    @DrawableRes  int iconOnDrawable;
    @DrawableRes int iconOffDrawable;
    @DrawableRes int defaultTabIcon = R.mipmap.ic_launcher;


    public TabItem(String tabName, @DrawableRes int iconOn, @DrawableRes int iconOff) {
        this.tabName = tabName;
        this.iconOffDrawable = iconOff;
        this.iconOnDrawable = iconOn;
    }


    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public int getDefaultTabIcon() {
        return defaultTabIcon;
    }

    public void setDefaultTabIcon(int defaultTabIcon) {
        this.defaultTabIcon = defaultTabIcon;
    }


    public int getIconOnDrawable() {
        return iconOnDrawable;
    }

    public int getIconOffDrawable() {
        return iconOffDrawable;
    }
}
