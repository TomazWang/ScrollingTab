package me.tomazwang.scrollingtab;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import me.tomazwang.scrollingtab.model.TabItem;

/**
 * Created by TomazWang on 2017/3/10.
 */
public class ScrollingTabAdapter extends RecyclerView.Adapter<ScrollingTabAdapter.ViewHolder>{
    private static final String TAG = ScrollingTabAdapter.class.getSimpleName();

    private final List<TabItem> mItemList;
    private HashMap<TabItem, Bitmap> mOnIconMap = new HashMap<>();
    private HashMap<TabItem, Bitmap> mOffIconMap = new HashMap<>();


    public ScrollingTabAdapter(List<TabItem> itemList) {
        this.mItemList = itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_scrollingtab, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        int itemIndex = position % mItemList.size();
        holder.onBindViewHolder(mItemList.get(itemIndex));
    }

    @Override
    public int getItemCount() {
        return mItemList.size() * 10000000;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        private final ImageView mIconImageView;
        private final TextView mIconText;

        public ViewHolder(View itemView) {
            super(itemView);

            this.mIconImageView = (ImageView)itemView.findViewById(R.id.imageView_scrollTabItem_tabIcon);
            this.mIconText = (TextView)itemView.findViewById(R.id.textView_scrollingTabItem_tabName);

        }

        void onBindViewHolder(final TabItem tabItem){

            mIconImageView.setImageResource(tabItem.getIconOnDrawable());
            mIconText.setText(tabItem.getTabName());
        }


    }
}
