package kr.jung.shareidea_list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShareIdea_Adapter extends BaseAdapter {

    private ArrayList<ShareIDea_Item> mItems = new ArrayList<>();

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public ShareIDea_Item getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Context context = parent.getContext();

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.shareidea_item, parent, false);
        }

        ImageView iv_Icon = (ImageView) convertView.findViewById(R.id.iv_icon);
        TextView tv_Station = (TextView) convertView.findViewById(R.id.tv_name);
        CheckBox cb_Favorites = (CheckBox) convertView.findViewById(R.id.favorites_Station);

        ShareIDea_Item ShareIdea_Item = getItem(position);

        iv_Icon.setImageDrawable(ShareIdea_Item.getIcon());
        tv_Station.setText(ShareIdea_Item.getName());
        cb_Favorites.setChecked(ShareIdea_Item.getChecked());

        return convertView;
    }

    public void addItem(Drawable icon, String name, Boolean favorites) {
        ShareIDea_Item mShareidea_Item = new ShareIDea_Item();

        mShareidea_Item.setIcon(icon);
        mShareidea_Item.setName(name);
        mShareidea_Item.setChecked(favorites);

        mItems.add(mShareidea_Item);
    }
}
