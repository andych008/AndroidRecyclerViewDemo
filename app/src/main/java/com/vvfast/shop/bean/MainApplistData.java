
package com.vvfast.shop.bean;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class MainApplistData {

    @Expose
    private List<AppItem> top = new ArrayList<AppItem>();
    @Expose
    private List<AppItem> list = new ArrayList<AppItem>();

    /**
     * 
     * @return
     *     The top
     */
    public List<AppItem> getTop() {
        return top;
    }

    /**
     * 
     * @param top
     *     The top
     */
    public void setTop(List<AppItem> top) {
        this.top = top;
    }

    /**
     * 
     * @return
     *     The list
     */
    public List<AppItem> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The appItem
     */
    public void setList(List<AppItem> list) {
        this.list = list;
    }

}
