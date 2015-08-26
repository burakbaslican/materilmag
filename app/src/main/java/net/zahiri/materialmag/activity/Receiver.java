package net.zahiri.materialmag.activity;

import android.content.Context;
import android.content.Intent;

import com.parse.ParsePushBroadcastReceiver;
import org.json.JSONException;
import org.json.JSONObject;


public class Receiver extends ParsePushBroadcastReceiver {
    private String msg = "";

    @Override
    public void onPushOpen(Context context, Intent intent) {

        try {
            Intent i = new Intent(context, MainActivity.class);
            JSONObject json = new JSONObject(intent.getExtras().getString("com.parse.Data"));
            msg = json.getString("alert");
            i.putExtra("message", msg);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);

        }catch (JSONException e){

        }
    }

}
