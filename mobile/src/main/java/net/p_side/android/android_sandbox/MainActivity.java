package net.p_side.android.android_sandbox;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;

import butterknife.Bind;

/**
 * Created by keima on 15/08/21.
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.content_frame)
    DrawerLayout mDrawerLayout;
    @Bind(R.id.content_frame)
    FrameLayout mFrameLayout;
    @Bind(R.id.left_drawer)
    ListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);



    }
}
