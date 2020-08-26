package kr.jung.shareidea_list;


import android.graphics.drawable.Drawable;

public class ShareIDea_Item {

    private Drawable icon;
    private String Station;
    private Boolean favorites;

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public Drawable getIcon() {
        return icon;
    }

    public String getName() {
        return Station;
    }

    public void setName(String station) {
        this.Station = station;
    }

    public Boolean getChecked() {
        return favorites;
    }

    public void setChecked(Boolean favorites) {
        this.favorites = favorites;
    }

}
