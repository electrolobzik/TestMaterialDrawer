package com.electrolobzik.testmaterialdrawer;

import android.os.Bundle;

/**
 * A login screen that offers login via email/password.
 */
public class TestActivity2 extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test2);

		setupNavigationDrawer();
	}
}

