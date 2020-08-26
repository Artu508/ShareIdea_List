package kr.jung.shareidea_list;

import android.app.Activity;
import android.widget.ListView;

import androidx.core.content.ContextCompat;

public class MainSet {

    Activity aMainSet;
    ListView mlistView;

    public MainSet(Activity activity){
        aMainSet = activity;
        mlistView = (ListView)aMainSet.findViewById(R.id.lst_ShareItem);
    }

    public void SetFavorites_Station(){
        ShareIdea_Adapter mLstFavorites_Station_Adapter = new ShareIdea_Adapter();

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                mLstFavorites_Station_Adapter.addItem(ContextCompat.getDrawable(aMainSet.getApplicationContext(), R.drawable.sans),"역" + i,false);
            } else {
                mLstFavorites_Station_Adapter.addItem(ContextCompat.getDrawable(aMainSet.getApplicationContext(), R.drawable.wa),"역" + i, true);
            }
        }


        mlistView.setAdapter(mLstFavorites_Station_Adapter);
    }

}
