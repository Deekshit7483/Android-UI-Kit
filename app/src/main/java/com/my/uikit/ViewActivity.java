package com.my.uikit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ScrollView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.widget.ImageView;
import android.view.View;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.facebook.shimmer.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.MobileAds;

public class ViewActivity extends AppCompatActivity {
	
	private LinearLayout toolbar;
	private LinearLayout linear1;
	private TextView textview_title;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear8;
	private LinearLayout codesl;
	private LinearLayout linear_dash;
	private TextView textview6;
	private LinearLayout linear5;
	private LinearLayout linear7;
	private AdView adview1;
	private ImageView imageview1;
	private TextView textview_codename;
	private LinearLayout linear10;
	private LinearLayout linear3;
	private TextView textview15;
	private LinearLayout linear11;
	private ImageView imageview5;
	private TextView textview_code;
	private TextView textview4;
	private TextView textview_name;
	private ImageView imageview_verify;
	private TextView textview13;
	private TextView textview_date;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.view);
		initialize(_savedInstanceState);
		
		com.google.android.gms.ads.MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		toolbar = findViewById(R.id.toolbar);
		linear1 = findViewById(R.id.linear1);
		textview_title = findViewById(R.id.textview_title);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear8 = findViewById(R.id.linear8);
		codesl = findViewById(R.id.codesl);
		linear_dash = findViewById(R.id.linear_dash);
		textview6 = findViewById(R.id.textview6);
		linear5 = findViewById(R.id.linear5);
		linear7 = findViewById(R.id.linear7);
		adview1 = findViewById(R.id.adview1);
		imageview1 = findViewById(R.id.imageview1);
		textview_codename = findViewById(R.id.textview_codename);
		linear10 = findViewById(R.id.linear10);
		linear3 = findViewById(R.id.linear3);
		textview15 = findViewById(R.id.textview15);
		linear11 = findViewById(R.id.linear11);
		imageview5 = findViewById(R.id.imageview5);
		textview_code = findViewById(R.id.textview_code);
		textview4 = findViewById(R.id.textview4);
		textview_name = findViewById(R.id.textview_name);
		imageview_verify = findViewById(R.id.imageview_verify);
		textview13 = findViewById(R.id.textview13);
		textview_date = findViewById(R.id.textview_date);
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", textview_code.getText().toString().trim()));
				SketchwareUtil.showMessage(getApplicationContext(), "Code Copied");
			}
		});
	}
	
	private void initializeLogic() {
		textview_codename.setText(getIntent().getStringExtra("t"));
		textview_code.setText(getIntent().getStringExtra("c"));
		_round_corner_and_ripple(codesl, 28, 5, "#FFFFFF", false);
		_round_corner_and_ripple(linear8, 28, 5, "#FFFFFF", false);
		toolbar.setElevation((float)7);
		_removeScollBar(vscroll1);
		_rippleRoundStroke(imageview_verify, "#FFFFFF", "#FFFFFF", 360, 0, "#000000");
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		
		imageview_verify.setVisibility(View.INVISIBLE);
		{
			AdRequest adRequest = new AdRequest.Builder().build();
			adview1.loadAd(adRequest);
		}
	}
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		if (adview1 != null) {
			adview1.destroy();
		}
	}
	
	@Override
	public void onPause() {
		super.onPause();
		if (adview1 != null) {
			adview1.pause();
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (adview1 != null) {
			adview1.resume();
		}
	}
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _round_corner_and_ripple(final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setBackground(gd);
			_view.setElevation((int)_shadow);
		}
	}
	
	
	public void _Round_loading_dialog(final boolean _visibility) {
		if (_visibility) {
			if (LoadingDialog== null){
					LoadingDialog = new ProgressDialog(this);
					
				LoadingDialog.setCancelable(false);
					LoadingDialog.setCanceledOnTouchOutside(false);
					
					LoadingDialog.requestWindowFeature(Window.FEATURE_NO_TITLE); 
					LoadingDialog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
					
			}
			LoadingDialog.show();
			LoadingDialog.setContentView(R.layout.loading_bar);
			
			LinearLayout loading_bar_layout = (LinearLayout)LoadingDialog.findViewById(R.id.loading_bar_layout);
			
			
			loading_bar_layout.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)100, 0xFFFFFFFF));
		}
		else {
			if (LoadingDialog != null){
				LoadingDialog.dismiss();
			}
		}
	}
	private ProgressDialog LoadingDialog;
	{
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
