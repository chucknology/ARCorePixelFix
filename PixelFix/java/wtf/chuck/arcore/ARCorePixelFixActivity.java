package wtf.chuck.arcore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ARCorePixelFixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wtf_chuck_transparent_activity);
    }

    @Override
    protected void onResume() {
        super.onResume();
        finish();
    }

}
