package org.poletalks.sdk.pole_android_sdk.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

import java.io.IOException;

/**
 * Created by anjal on 11/1/17.
 */

public class PoleNotificationService {

    public String getToken() {
        String refreshedToken = null;
        try {
            refreshedToken = FirebaseInstanceId.getInstance().getToken("732877727331", "FCM");
            Log.d("MyInstanceId", "sdk:Refreshed token: " + refreshedToken);
            sendRegistrationToServer(refreshedToken);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // TODO: Implement this method to send any registration to your app's servers.
        return (refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
//        if (CheckNetwork.isInternetAvailable(getApplicationContext()))
//        {
//            RetrofitConfig retrofitConfig = new RetrofitConfig(getApplicationContext());
//            Retrofit retro = retrofitConfig.getRetro();
//            ApiInterface setprofile = retro.create(ApiInterface.class);
//            UserProfile user = new UserProfile();
//            user.setGcm(refreshedToken);
//            Call<SetProfileResponse> call = setprofile.setProfile(user);
//            call.enqueue(new Callback<SetProfileResponse>()
//            {
//                @Override
//                public void onResponse(Call<SetProfileResponse> call, Response<SetProfileResponse> response)
//                {
//                    Log.e("FCM", String.valueOf(response.code()));
//                }
//
//                @Override
//                public void onFailure(Call<SetProfileResponse> call, Throwable t)
//                {
//                    Log.e("FCM", "onFailure::liketweet-" + t.toString());
//                }
//            });
//        }

    }

}
