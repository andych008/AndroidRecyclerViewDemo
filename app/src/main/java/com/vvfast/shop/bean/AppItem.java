
package com.vvfast.shop.bean;

import com.google.gson.annotations.Expose;

public class AppItem {

    @Expose
    private String name;
    @Expose
    private String icon;
    @Expose
    private String type;
    @Expose
    private Integer rating;
    @Expose
    private Double size;
    @Expose
    private Boolean isPromoted;
    @Expose
    private String apk;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The size
     */
    public Double getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The isPromoted
     */
    public Boolean getIsPromoted() {
        return isPromoted;
    }

    /**
     * 
     * @param isPromoted
     *     The isPromoted
     */
    public void setIsPromoted(Boolean isPromoted) {
        this.isPromoted = isPromoted;
    }

    /**
     * 
     * @return
     *     The apk
     */
    public String getApk() {
        return apk;
    }

    /**
     * 
     * @param apk
     *     The apk
     */
    public void setApk(String apk) {
        this.apk = apk;
    }

}
