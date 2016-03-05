package com.example.ad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyServic extends BroadcastReceiver {
public static final String ACTION="com.example.ad.MyServic";
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "接收到了一条MyServic"+intent.getStringExtra("name"),0).show();
	}

}
