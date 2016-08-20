package dataTransmit;

import com.example.datatransmit2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity{
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		btn=(Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,OtherActivity.class);
				Obj obj = new Obj();
				obj.setName("¶º±È");
				OtherActivity.obj=obj;
				startActivity(intent);
			}
		});
	}
}

