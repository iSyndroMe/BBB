package com.example.bbb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyFragment extends Fragment implements OnClickListener{
	
	Button btn;
	TextView tv;
	boolean areWeVisible = false;
	
	public static MyFragment newInstance() {
		MyFragment f = new MyFragment();
		return f;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment, container , false);
		btn = (Button) v.findViewById(R.id.button1);
		tv = (TextView) v.findViewById(R.id.textView1);
		tv.setVisibility(View.GONE);
		btn.setOnClickListener(this);
		return v;
	}
	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.button1:
			if(!areWeVisible){
				tv.setVisibility(View.VISIBLE);
				areWeVisible = true;
			}else{
				tv.setVisibility(View.GONE);
				areWeVisible = false;
			}
			break;

		}
		
	}

}
