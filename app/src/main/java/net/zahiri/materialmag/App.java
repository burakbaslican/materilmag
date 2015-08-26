package net.zahiri.materialmag;

import android.app.Application;
import com.parse.Parse;
/**
 * Created by dhm17438 on 26.8.2015.
 */
public class App extends Application{
    @Override public void onCreate() {
        super.onCreate();


        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "I7rMFuc3WdW0fnGeF4IuPycCvboVRcZNPBFaSUDM", "3oZtoHy6qGS0yDL2MNHhxCFO8y040HqQPwG0Z0Gg");
    }
}
