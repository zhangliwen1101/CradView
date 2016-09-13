package com.jack.cardviewdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class OtherActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.other, menu);
		return true;
	}

}
