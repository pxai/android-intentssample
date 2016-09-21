package io.pello.android.intentssample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * AnotherActivity shows how to get extra parameters from intent
 * @author Pello Xabier Altadill Izura
 * @greetz Mr. Remírez
 */
public class AnotherActivity extends Activity {
	private TextView textView1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.another_activity);
		
		textView1 = (TextView) findViewById(R.id.intentParameter);
		
		if (null != savedInstanceState)
			Log.d("PELLODEBUG","Bundle contents: " + savedInstanceState.toString());
		
		Log.d("PELLODEBUG","Passed parameter through intent: " +  getIntent().getStringExtra("extraValue"));
		textView1.setText( getIntent().getStringExtra("extraValue"));
		

	}
}
