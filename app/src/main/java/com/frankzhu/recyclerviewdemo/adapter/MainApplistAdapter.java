package com.frankzhu.recyclerviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.frankzhu.recyclerviewdemo.R;
import com.vvfast.shop.bean.AppItem;
import com.vvfast.shop.bean.MainApplistData;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2015/2/6  14:34.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2015/2/6        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class MainApplistAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public enum ITEM_TYPE {
        ITEM_TYPE_GRID,
        ITEM_TYPE_LINE
    }

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private MainApplistData applistData;

    public MainApplistAdapter(Context context, MainApplistData applistData) {
        this.applistData = applistData;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEM_TYPE.ITEM_TYPE_LINE.ordinal()) {
            return new LineHolder(mLayoutInflater.inflate(R.layout.app_line_item, parent, false));
        } else {
            return new GridHolder(mLayoutInflater.inflate(R.layout.app_grid_item, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // TODO: 9/17/2015
        if (holder instanceof LineHolder) {
            AppItem item = applistData.getList().get(position-1);

//            ((LineHolder) holder).icon = item.getIcon();
        } else if (holder instanceof GridHolder) {
//            ((ImageViewHolder) holder).mTextView.setText(mTitles[position]);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position == 0 ? ITEM_TYPE.ITEM_TYPE_GRID.ordinal() : ITEM_TYPE.ITEM_TYPE_LINE.ordinal();
    }

    @Override
    public int getItemCount() {
        return applistData == null ? 0 : applistData.getList().size()+1;
    }

    public static class LineHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.icon)
        ImageView icon;
        @Bind(R.id.name)
        TextView name;
        @Bind(R.id.rating)
        RatingBar rating;
        @Bind(R.id.type)
        TextView type;
        @Bind(R.id.size)
        TextView size;
        @Bind(R.id.is_promoted)
        TextView isPromoted;
        @Bind(R.id.install)
        Button install;

        LineHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.install)
        void onItemClick() {
            Log.d("TextViewHolder", "onClick--> position = " + getPosition());
        }
    }

    public static class GridHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.grid1)
        ImageView grid1;
        @Bind(R.id.grid2)
        ImageView grid2;
        @Bind(R.id.grid3)
        ImageView grid3;
        @Bind(R.id.grid4)
        ImageView grid4;

        GridHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.grid1)
        void onItemClick() {
            Log.d("ImageViewHolder", "onClick--> position = " + getPosition());
        }
    }
}
