package beacon_sdk.poletalks.com.pole_sdk;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;
import com.google.gson.JsonObject;
import beacon_sdk.poletalks.com.pole_sdk.Model.LoginResponse;
import beacon_sdk.poletalks.com.pole_sdk.RetrofitSupport.ApiInterface;
import beacon_sdk.poletalks.com.pole_sdk.RetrofitSupport.RetrofitConfig;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FeedbackActivity extends AppCompatActivity {

    private Context context;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        context = this;
//        setTitle("FEEDBACK");

        getdata("jdp_superadmin", "password");
    }


    public void getdata(String login, String pass) {
        RetrofitConfig retrofitConfig = new RetrofitConfig(context);
        Retrofit retro = retrofitConfig.getRetro();
        final ApiInterface admin = retro.create(ApiInterface.class);

        JsonObject abc = new JsonObject();
        abc.addProperty("login_id", login);
        abc.addProperty("password", pass);

        Call<LoginResponse> call = admin.adminLogin(abc);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.code() == 200) {

                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(context, "Oops, something went wrong!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
