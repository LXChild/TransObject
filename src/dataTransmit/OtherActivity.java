package dataTransmit;

import com.example.datatransmit2.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OtherActivity extends Activity{
	public static Obj obj;
	private TextView TV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_02);
		Log.d("OtherActivity",obj.getName());
		TV=(TextView) findViewById(R.id.TV);
		TV.setText(obj.getName());
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		obj=null;
	}
}
