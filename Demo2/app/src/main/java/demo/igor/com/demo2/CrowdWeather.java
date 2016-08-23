package demo.igor.com.demo2;

import com.firebase.client.Firebase;

/**
 * Created by Столик on 23.08.2016.
 */
public class CrowdWeather extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
