package beacon_sdk.poletalks.com.pole_beacon_sdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import beacon_sdk.poletalks.com.pole_sdk.PoleProximityManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        PoleProximityManager.stopScanning();
        PoleProximityManager.destroyScanning();
    }
}
