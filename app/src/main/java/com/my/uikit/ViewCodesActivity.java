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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.widget.AdapterView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.facebook.shimmer.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class ViewCodesActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private String myjson = "";
	private String Search = "";
	private double n1 = 0;
	private HashMap<String, Object> cacheMap = new HashMap<>();
	private double n = 0;
	private double length = 0;
	
	private ArrayList<HashMap<String, Object>> imap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> maplist = new ArrayList<>();
	
	private LinearLayout bin;
	private ListView listview1;
	private LinearLayout linear2;
	private LinearLayout toolbar;
	private TextView textview1;
	private LinearLayout linear_simmer;
	private LinearLayout linear61;
	private LinearLayout linear66;
	private LinearLayout linear71;
	private LinearLayout linear76;
	private LinearLayout linear81;
	private LinearLayout linear86;
	private LinearLayout linear91;
	private LinearLayout linear96;
	private LinearLayout linear101;
	private LinearLayout linear106;
	private LinearLayout linear_;
	private LinearLayout linear7;
	private ShimmerFrameLayout linears;
	private ShimmerFrameLayout l;
	private LinearLayout linear62;
	private LinearLayout linear63;
	private ShimmerFrameLayout linears1;
	private ShimmerFrameLayout l1;
	private LinearLayout linear67;
	private LinearLayout linear68;
	private ShimmerFrameLayout linears2;
	private ShimmerFrameLayout l2;
	private LinearLayout linear72;
	private LinearLayout linear73;
	private ShimmerFrameLayout linears3;
	private ShimmerFrameLayout l3;
	private LinearLayout linear77;
	private LinearLayout linear78;
	private ShimmerFrameLayout linears4;
	private ShimmerFrameLayout l4;
	private LinearLayout linear82;
	private LinearLayout linear83;
	private ShimmerFrameLayout linears5;
	private ShimmerFrameLayout l5;
	private LinearLayout linear87;
	private LinearLayout linear88;
	private ShimmerFrameLayout linears6;
	private ShimmerFrameLayout l6;
	private LinearLayout linear92;
	private LinearLayout linear93;
	private ShimmerFrameLayout linears7;
	private ShimmerFrameLayout l7;
	private LinearLayout linear97;
	private LinearLayout linear98;
	private ShimmerFrameLayout linears8;
	private ShimmerFrameLayout l8;
	private LinearLayout linear102;
	private LinearLayout linear103;
	private ShimmerFrameLayout linears9;
	private ShimmerFrameLayout l9;
	private LinearLayout linear107;
	private LinearLayout linear108;
	private ShimmerFrameLayout linears10;
	private ShimmerFrameLayout l10;
	
	private Intent i = new Intent();
	private TimerTask t;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.view_codes);
		initialize(_savedInstanceState);
		
		com.google.android.gms.ads.MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		bin = findViewById(R.id.bin);
		listview1 = findViewById(R.id.listview1);
		linear2 = findViewById(R.id.linear2);
		toolbar = findViewById(R.id.toolbar);
		textview1 = findViewById(R.id.textview1);
		linear_simmer = findViewById(R.id.linear_simmer);
		linear61 = findViewById(R.id.linear61);
		linear66 = findViewById(R.id.linear66);
		linear71 = findViewById(R.id.linear71);
		linear76 = findViewById(R.id.linear76);
		linear81 = findViewById(R.id.linear81);
		linear86 = findViewById(R.id.linear86);
		linear91 = findViewById(R.id.linear91);
		linear96 = findViewById(R.id.linear96);
		linear101 = findViewById(R.id.linear101);
		linear106 = findViewById(R.id.linear106);
		linear_ = findViewById(R.id.linear_);
		linear7 = findViewById(R.id.linear7);
		linears = findViewById(R.id.linears);
		l = findViewById(R.id.l);
		linear62 = findViewById(R.id.linear62);
		linear63 = findViewById(R.id.linear63);
		linears1 = findViewById(R.id.linears1);
		l1 = findViewById(R.id.l1);
		linear67 = findViewById(R.id.linear67);
		linear68 = findViewById(R.id.linear68);
		linears2 = findViewById(R.id.linears2);
		l2 = findViewById(R.id.l2);
		linear72 = findViewById(R.id.linear72);
		linear73 = findViewById(R.id.linear73);
		linears3 = findViewById(R.id.linears3);
		l3 = findViewById(R.id.l3);
		linear77 = findViewById(R.id.linear77);
		linear78 = findViewById(R.id.linear78);
		linears4 = findViewById(R.id.linears4);
		l4 = findViewById(R.id.l4);
		linear82 = findViewById(R.id.linear82);
		linear83 = findViewById(R.id.linear83);
		linears5 = findViewById(R.id.linears5);
		l5 = findViewById(R.id.l5);
		linear87 = findViewById(R.id.linear87);
		linear88 = findViewById(R.id.linear88);
		linears6 = findViewById(R.id.linears6);
		l6 = findViewById(R.id.l6);
		linear92 = findViewById(R.id.linear92);
		linear93 = findViewById(R.id.linear93);
		linears7 = findViewById(R.id.linears7);
		l7 = findViewById(R.id.l7);
		linear97 = findViewById(R.id.linear97);
		linear98 = findViewById(R.id.linear98);
		linears8 = findViewById(R.id.linears8);
		l8 = findViewById(R.id.l8);
		linear102 = findViewById(R.id.linear102);
		linear103 = findViewById(R.id.linear103);
		linears9 = findViewById(R.id.linears9);
		l9 = findViewById(R.id.l9);
		linear107 = findViewById(R.id.linear107);
		linear108 = findViewById(R.id.linear108);
		linears10 = findViewById(R.id.linears10);
		l10 = findViewById(R.id.l10);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				Animation animation1 = new AlphaAnimation(0.3f, 1.0f);
				animation1.setDuration(4000);
				_param2.startAnimation(animation1);
				i.setClass(getApplicationContext(), ViewActivity.class);
				i.putExtra("t", maplist.get((int)_position).get("title").toString());
				i.putExtra("c", maplist.get((int)_position).get("code").toString());
				i.addFlags(i.FLAG_ACTIVITY_NO_ANIMATION);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		try {
			  java.io.InputStream ass = this.getAssets().open("java code.json");
			           int size = ass.available();
			           byte[] buffer = new byte[size];
			           ass.read(buffer);
			           ass.close();
			           myjson = new String(buffer, "UTF-8");
			_loadData(myjson);
		} catch(Exception e) {
			 
		}
		_simmer();
		listview1.setVisibility(View.GONE);
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						linear2.setVisibility(View.GONE);
						listview1.setVisibility(View.VISIBLE);
					}
				});
			}
		};
		_timer.schedule(t, (int)(2000));
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
	
	
	public void _RippleEffects(final String _color, final View _view) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_color)});
		android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null);
		_view.setBackground(ripdr);
	}
	
	
	public void _loadData(final String _path) {
		maplist = new Gson().fromJson(_path, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		listview1.setAdapter(new Listview1Adapter(maplist));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
	}
	
	
	public void _simmer() {
		linear_simmer.setElevation((float)4);
		linear_simmer.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear61.setElevation((float)4);
		linear61.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear66.setElevation((float)4);
		linear66.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear71.setElevation((float)4);
		linear71.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear76.setElevation((float)4);
		linear76.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear81.setElevation((float)4);
		linear81.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear91.setElevation((float)4);
		linear91.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear96.setElevation((float)4);
		linear96.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear101.setElevation((float)4);
		linear101.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear106.setElevation((float)4);
		linear106.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		linear86.setElevation((float)4);
		linear86.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		l.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		l10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
		linears10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFEEEEEE));
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.code, null);
			}
			
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			textview1.setText(String.valueOf((long)(_position + 1)).concat(": ").concat(maplist.get((int)_position).get("title").toString()));
			linear2.setElevation((float)5);
			_rippleRoundStroke(linear2, "#FFFFFF", "#E0E0E0", 15, 2, "#E0E0E0");
			_rippleRoundStroke(linear3, "#FFFFFF", "#E0E0E0", 15, 2, "#E0E0E0");
			Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left);
			anim.setInterpolator(new OvershootInterpolator());
			linear2.setAnimation(anim);
			anim.start();
			
			return _view;
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