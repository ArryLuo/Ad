package com.example.ad;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				MyServic servic=new MyServic();
				//������˵Ĺ㲥����
				Intent i=new Intent("com.exaxmple.txestbroadcastreceiver.intent.action.MyRecever");
				i.putExtra("name", "�Ұ���");
				//i.getAction(servic.ACTION);
				
				sendBroadcast(i);//����һ���㲥;
			}
		});
	}

}
