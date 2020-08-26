package kr.jung.shareidea_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MainSet cMainSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cMainSet = new MainSet(this);
        cMainSet.SetFavorites_Station();
    }
}
