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
import android.widget.ScrollView;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import android.view.View;
import com.facebook.shimmer.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
	
	private String _ad_unit_id;
	
	private String URL = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear2;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear12;
	private LinearLayout linear19;
	private AdView adview1;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private ImageView imageview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview1;
	private TextView textview4;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private ImageView imageview2;
	private TextView textview6;
	private TextView textview7;
	private LinearLayout linear22;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear23;
	private TextView textview12;
	private ImageView imageview10;
	private LinearLayout linear16;
	private TextView textview5;
	private ImageView imageview6;
	private LinearLayout linear17;
	private TextView textview8;
	private ImageView imageview7;
	private TextView textview10;
	
	private Intent i = new Intent();
	private Intent what = new Intent();
	private Intent rat = new Intent();
	private InterstitialAd inter;
	private InterstitialAdLoadCallback _inter_interstitial_ad_load_callback;
	private FullScreenContentCallback _inter_full_screen_content_callback;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		
		com.google.android.gms.ads.MobileAds.initialize(this);
		_ad_unit_id = "ca-app-pub-5995827559592413/8307476607";
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear3 = findViewById(R.id.linear3);
		linear2 = findViewById(R.id.linear2);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear12 = findViewById(R.id.linear12);
		linear19 = findViewById(R.id.linear19);
		adview1 = findViewById(R.id.adview1);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		imageview1 = findViewById(R.id.imageview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview1 = findViewById(R.id.textview1);
		textview4 = findViewById(R.id.textview4);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		imageview2 = findViewById(R.id.imageview2);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		linear22 = findViewById(R.id.linear22);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		linear23 = findViewById(R.id.linear23);
		textview12 = findViewById(R.id.textview12);
		imageview10 = findViewById(R.id.imageview10);
		linear16 = findViewById(R.id.linear16);
		textview5 = findViewById(R.id.textview5);
		imageview6 = findViewById(R.id.imageview6);
		linear17 = findViewById(R.id.linear17);
		textview8 = findViewById(R.id.textview8);
		imageview7 = findViewById(R.id.imageview7);
		textview10 = findViewById(R.id.textview10);
		
		linear2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), CreateDesignActivity.class);
				startActivity(i);
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), CreateNotificationActivity.class);
				startActivity(i);
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ViewCodesActivity.class);
				startActivity(i);
			}
		});
		
		linear22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				what.setAction(Intent.ACTION_VIEW);
				what.setData(Uri.parse("https://chat.whatsapp.com/Fzx3o1y7FTp52pbQvSPoGA"));
				startActivity(what);
			}
		});
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				what.setAction(Intent.ACTION_VIEW);
				what.setData(Uri.parse("https://chat.whatsapp.com/Fzx3o1y7FTp52pbQvSPoGA"));
				startActivity(what);
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				{
					AdRequest adRequest = new AdRequest.Builder().build();
					InterstitialAd.load(MainActivity.this, _ad_unit_id, adRequest, _inter_interstitial_ad_load_callback);
				}
				inter.setFullScreenContentCallback(_inter_full_screen_content_callback);
				URL = "https://play.google.com/store/apps/details?id=com.my.uikit";
				Intent i = new Intent(android.content.Intent.ACTION_SEND); i.setType("text/plain"); i.putExtra(android.content.Intent.EXTRA_TEXT,URL); startActivity(Intent.createChooser(i,"Choose one.."));
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rat.setAction(Intent.ACTION_VIEW);
				rat.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.my.uikit"));
				startActivity(rat);
			}
		});
		
		_inter_interstitial_ad_load_callback = new InterstitialAdLoadCallback() {
			@Override
			public void onAdLoaded(InterstitialAd _param1) {
				
			}
			
			@Override
			public void onAdFailedToLoad(LoadAdError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		
		_inter_full_screen_content_callback = new FullScreenContentCallback() {
			@Override
			public void onAdDismissedFullScreenContent() {
				
			}
			
			@Override
			public void onAdFailedToShowFullScreenContent(AdError _adError) {
				final int _errorCode = _adError.getCode();
				final String _errorMessage = _adError.getMessage();
				
			}
			
			@Override
			public void onAdShowedFullScreenContent() {
				
			}
		};
	}
	
	private void initializeLogic() {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			int clrs [] = {0xFF5B86E5,0xFF36D1DC};
			SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, clrs);
			SketchUi.setCornerRadius(d*10);
			linear2.setElevation(d*15);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFBBDEFB}), SketchUi, null);
			linear2.setBackground(SketchUiRD);
			linear2.setClickable(true);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			int clrs [] = {0xFF9575CD,0xFF9575CD};
			SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, clrs);
			SketchUi.setCornerRadii(new float[]{
				d*0,d*0,d*0 ,d*0,d*138,d*138 ,d*0,d*0});
			linear3.setElevation(d*15);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFD1C4E9}), SketchUi, null);
			linear3.setBackground(SketchUiRD);
			linear3.setClickable(true);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			int clrs [] = {0xFFFF7EB3,0xFFFF758C};
			SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
			SketchUi.setCornerRadius(d*10);
			linear7.setElevation(d*15);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFF48FB1}), SketchUi, null);
			linear7.setBackground(SketchUiRD);
			linear7.setClickable(true);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			int clrs [] = {0xFF7F53AC,0xFF647DEE};
			SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, clrs);
			SketchUi.setCornerRadius(d*10);
			linear8.setElevation(d*15);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFB39DDB}), SketchUi, null);
			linear8.setBackground(SketchUiRD);
			linear8.setClickable(true);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF7F53AC);
			SketchUi.setCornerRadius(d*360);
			SketchUi.setStroke(d*2,0xFFFFFFFF);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFB388FF}), SketchUi, null);
			linear11.setBackground(SketchUiRD);
			linear11.setClickable(true);
		}
		//16
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			int clrs [] = {0xFFFC9842,0xFFFE5F75};
			SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BL_TR, clrs);
			SketchUi.setCornerRadius(d*10);
			linear16.setElevation(d*4);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFFF8A80}), SketchUi, null);
			linear16.setBackground(SketchUiRD);
			linear16.setClickable(true);
		}
		//17
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			int clrs [] = {0xFFC373F2,0xFFF977CE};
			SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TL_BR, clrs);
			SketchUi.setCornerRadius(d*10);
			linear17.setElevation(d*4);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE91E63}), SketchUi, null);
			linear17.setBackground(SketchUiRD);
			linear17.setClickable(true);
		}
		/*{
android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
int clrs [] = {0xFF42FCDB,0xFF3EE577};
SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, clrs);
SketchUi.setCornerRadius(d*10);
linear18.setElevation(d*4);
android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF4CAF50}), SketchUi, null);
linear18.setBackground(SketchUiRD);
linear18.setClickable(true);
}*/
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			int clrs [] = {0xFF42FCDB,0xFF3EE577};
			SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, clrs);
			SketchUi.setCornerRadius(d*10);
			linear23.setElevation(d*4);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF4CAF50}), SketchUi, null);
			linear23.setBackground(SketchUiRD);
			linear23.setClickable(true);
		}
		
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
