package com.electrolobzik.testmaterialdrawer;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;

/**
 * A login screen that offers login via email/password.
 */
public class BaseActivity extends AppCompatActivity {

	protected void setupNavigationDrawer() {

		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		//Create the drawer
		Drawer drawer = new DrawerBuilder()
				.withActivity(this)
				.withToolbar(toolbar)
				.withShowDrawerOnFirstLaunch(true)
				.withTranslucentStatusBar(false)
				.build();
	}
}

