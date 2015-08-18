package com.electrolobzik.testmaterialdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * A login screen that offers login via email/password.
 */
public class TestActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);

		Button drawerBtn = (Button) findViewById(R.id.drawerBtn);
		drawerBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				setupNavigationDrawer();
			}
		});

		Button activityButton = (Button) findViewById(R.id.activityBtn);
		activityButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(TestActivity.this, TestActivity2.class);
				startActivity(intent);
			}
		});
	}
}

