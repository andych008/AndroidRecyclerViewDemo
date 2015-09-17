package com.frankzhu.recyclerviewdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frankzhu.recyclerviewdemo.R;
import com.frankzhu.recyclerviewdemo.adapter.MainApplistAdapter;
import com.vvfast.shop.bean.AppItem;
import com.vvfast.shop.bean.MainApplistData;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2015/2/6  14:42.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2015/2/6        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class MainApplistFragment extends Fragment {
    @Bind(R.id.recycler_view)
    RecyclerView mRecyclerView;

    public static MainApplistFragment newInstance() {
        MainApplistFragment fragment = new MainApplistFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_normal, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));//这里用线性显示 类似于list view
        MainApplistData mainApplistData = new MainApplistData();
        List<AppItem> list = new ArrayList<>();
        AppItem appItem = new AppItem();
        appItem.setApk("http://v.meituan.net/mobile/app/Android/group-292_1-meituan_.apk");
        appItem.setIcon("http://p15.qhimg.com/t01b2be11d6f60cefe0.png");
        appItem.setIsPromoted(true);
        appItem.setName("美团");
        appItem.setRating(100 * 4 / 5);
        appItem.setType("时尚与购物");
        appItem.setSize(12.7);
        list.add(appItem);
        mainApplistData.setList(list);
        mRecyclerView.setAdapter(new MainApplistAdapter(getActivity(), mainApplistData));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
