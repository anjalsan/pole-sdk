package beacon_sdk.poletalks.com.pole_beacon_sdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import beacon_sdk.poletalks.com.pole_sdk.PoleProximityManager;
import beacon_sdk.poletalks.com.pole_sdk.PoleView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v = new PoleView(this);
        setContentView(v);

        PoleProximityManager.onCreateBeacons(this, "SqsMXrtfSNncgUTHgiAzRSbLlnNruZxN");
    }


    @Override
    protected void onStart() {
        super.onStart();

        PoleProximityManager.startScanning();
    }

    @Override
    protected void onStop() {
        super.onStop();

        PoleProximityManager.stopScanning();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        PoleProximityManager.destroyScanning();
    }
}
