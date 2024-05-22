package com.my.uikit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.widget.EditText;
import android.widget.Switch;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CompoundButton;
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


public class CreateNotificationActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double n_typeColor = 0;
	private double code_p = 0;
	private boolean test = false;
	private boolean ONGOING = false;
	private boolean BADGE = false;
	private boolean VIBRATION = false;
	private boolean ACCENT_COLOR = false;
	private boolean time = false;
	private double isClicked = 0;
	private String accentColor = "";
	private String colorPicked = "";
	private String vibration = "";
	private String badge = "";
	private String timee = "";
	private String channelName1 = "";
	private String channelId1 = "";
	private String ongoing = "";
	private String cc = "";
	
	private ArrayList<HashMap<String, Object>> imap = new ArrayList<>();
	
	private LinearLayout linear79;
	private ScrollView vscroll1;
	private LinearLayout linear58;
	private LinearLayout linear59;
	private LinearLayout linear60;
	private TextView title;
	private TextView text;
	private ImageView imageview1;
	private TextView textview21;
	private TextView timeee;
	private LinearLayout linear1;
	private AdView adview1;
	private LinearLayout l;
	private LinearLayout source_code;
	private LinearLayout linear65;
	private LinearLayout linear62;
	private LinearLayout linear63;
	private LinearLayout linear66;
	private LinearLayout linear67;
	private LinearLayout linear68;
	private LinearLayout linear83;
	private LinearLayout linear78;
	private LinearLayout linear76;
	private LinearLayout linear75;
	private LinearLayout linear77;
	private LinearLayout linear84;
	private TextView i;
	private TextView textview33;
	private TextView textview34;
	private EditText activity;
	private TextView p2;
	private TextView textview25;
	private EditText titlee;
	private TextView textview26;
	private EditText textt;
	private Switch on;
	private Switch ev;
	private Switch bi;
	private Switch switch1;
	private TextView textview35;
	private EditText edittext1;
	private TextView code;
	
	private Calendar calendar = Calendar.getInstance();
	private AlertDialog.Builder codee;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.create_notification);
		initialize(_savedInstanceState);
		
		com.google.android.gms.ads.MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_fab = findViewById(R.id._fab);
		
		linear79 = findViewById(R.id.linear79);
		vscroll1 = findViewById(R.id.vscroll1);
		linear58 = findViewById(R.id.linear58);
		linear59 = findViewById(R.id.linear59);
		linear60 = findViewById(R.id.linear60);
		title = findViewById(R.id.title);
		text = findViewById(R.id.text);
		imageview1 = findViewById(R.id.imageview1);
		textview21 = findViewById(R.id.textview21);
		timeee = findViewById(R.id.timeee);
		linear1 = findViewById(R.id.linear1);
		adview1 = findViewById(R.id.adview1);
		l = findViewById(R.id.l);
		source_code = findViewById(R.id.source_code);
		linear65 = findViewById(R.id.linear65);
		linear62 = findViewById(R.id.linear62);
		linear63 = findViewById(R.id.linear63);
		linear66 = findViewById(R.id.linear66);
		linear67 = findViewById(R.id.linear67);
		linear68 = findViewById(R.id.linear68);
		linear83 = findViewById(R.id.linear83);
		linear78 = findViewById(R.id.linear78);
		linear76 = findViewById(R.id.linear76);
		linear75 = findViewById(R.id.linear75);
		linear77 = findViewById(R.id.linear77);
		linear84 = findViewById(R.id.linear84);
		i = findViewById(R.id.i);
		textview33 = findViewById(R.id.textview33);
		textview34 = findViewById(R.id.textview34);
		activity = findViewById(R.id.activity);
		p2 = findViewById(R.id.p2);
		textview25 = findViewById(R.id.textview25);
		titlee = findViewById(R.id.titlee);
		textview26 = findViewById(R.id.textview26);
		textt = findViewById(R.id.textt);
		on = findViewById(R.id.on);
		ev = findViewById(R.id.ev);
		bi = findViewById(R.id.bi);
		switch1 = findViewById(R.id.switch1);
		textview35 = findViewById(R.id.textview35);
		edittext1 = findViewById(R.id.edittext1);
		code = findViewById(R.id.code);
		codee = new AlertDialog.Builder(this);
		
		titlee.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				title.setText(_charSeq);
				if (_charSeq.equals("")) {
					title.setVisibility(View.GONE);
				}
				else {
					title.setVisibility(View.VISIBLE);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textt.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				text.setText(_charSeq);
				if (_charSeq.equals("")) {
					text.setVisibility(View.GONE);
				}
				else {
					text.setVisibility(View.VISIBLE);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		on.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					ongoing = "true";
				}
				else {
					ongoing = "false";
				}
			}
		});
		
		ev.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					vibration = "true";
				}
				else {
					vibration = "false";
				}
			}
		});
		
		bi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					badge = "true";
				}
				else {
					badge = "false";
				}
			}
		});
		
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					calendar = Calendar.getInstance();
					timee = "true";
					timeee.setVisibility(View.VISIBLE);
					timeee.setText(new SimpleDateFormat("HH:mm").format(calendar.getTime()));
				}
				else {
					timee = "false";
					timeee.setVisibility(View.GONE);
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				isClicked = 0;
				if (!edittext1.getText().toString().equals("")) {
					code.setText("");
					code.setText("//Code generated by Android tool app");
					cc = code.getText().toString().concat("\nint notifyId = 001;\nNotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);\nNotification.Builder mbuilder = new Notification.Builder(".concat(activity.getText().toString().concat(".this);\nmbuilder.setSmallIcon(R.drawable.".concat(edittext1.getText().toString().concat(");\nmbuilder.setContentTitle(\"".concat(titlee.getText().toString().concat("\");\nmbuilder.setContentText(\"".concat(textt.getText().toString().concat("\");".concat("mbuilder.setShowWhen(".concat(timee).concat(");\nmbuilder.setDefaults( Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE);\nmbuilder.setOngoing(".concat(ongoing.concat(");\nmbuilder.setColor(Color.parseColor(\"".concat(accentColor.concat("\"));\nif (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {\n		String channelId1 = \"1\";\n		String channelName1 = \"Notifications\";\n		NotificationChannel channel = new NotificationChannel(channelId1, channelName1, NotificationManager.IMPORTANCE_DEFAULT);\n		channel.enableLights(true);\n		channel.setLightColor(Color.BLUE);\n		channel.setShowBadge(".concat(badge.concat(");\n		channel.enableVibration(".concat(vibration.concat(");\n		mbuilder.setChannelId(channelId1);\n		if (mNotificationManager != null) {\n				mNotificationManager.createNotificationChannel(channel);\n		}\n} else {\n		mbuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);\n}\nif (mNotificationManager != null) {\n		mNotificationManager.notify(notifyId, mbuilder.build());\n}".concat(""))))))))))))))))))));
					if (titlee.getText().toString().equals("")) {
						code.setText(code.getText().toString().replace("mbuilder.setContentTitle(\"\");", ""));
					}
					if (textt.getText().toString().equals("")) {
						code.setText(code.getText().toString().replace("mbuilder.setContentText(\"\");", ""));
					}
					codee.setTitle("Notification code");
					codee.setMessage(cc);
					codee.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					codee.setNeutralButton("Copy", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", cc));
						}
					});
					codee.create().show();
				}
				else {
					_Toast("Cannot generate code. You don't specified the icon's name for the notification.", "", "#000000");
				}
			}
		});
	}
	
	private void initializeLogic() {
		linear59.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		_init();
		_fix_edittext();
		_collapsingToolbar(vscroll1);
		codee.setCancelable(false);
		_HighlightTextView("#FF9800", "#673AB7", "#9C27B0", "#388E3C", "#757575", code);
		setTitle("Notification");
		
		accentColor = "#2196F3";
		
		
		
		
		
		ongoing = "false";
		vibration = "false";
		badge = "false";
		timee = "false";
		timeee.setVisibility(View.GONE);
		
		
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
	public void _init() {
		cpDialog = new AlertDialog.Builder(CreateNotificationActivity.this).create();
		
		View convertView = (View) getLayoutInflater().inflate(R.layout.color_picker_layout, null);
		
		cpDialog.setView(convertView);
		final TextView colorText = (TextView)
		convertView.findViewById(R.id.textview2);
		
		colorText.setText("#000000");
		final LinearLayout colorLayout = (LinearLayout)
		convertView.findViewById(R.id.linear5);
		
		colorLayout.setBackgroundColor(Color.parseColor("#000000"));
		final SeekBar seekbarRed = (SeekBar)convertView.findViewById(R.id.seekbar1);
		
		seekbarRed.getProgressDrawable().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
		
		seekbarRed.getThumb().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
		final SeekBar seekbarGreen = (SeekBar)convertView.findViewById(R.id.seekbar2);
		
		seekbarGreen.getProgressDrawable().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
		
		seekbarGreen.getThumb().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
		final SeekBar seekbarBlue = (SeekBar)convertView.findViewById(R.id.seekbar3);
		
		seekbarBlue.getProgressDrawable().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
		
		seekbarBlue.getThumb().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
		seekbarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar a, int b, boolean c) {
				_convertColorPicked(seekbarRed.getProgress(), seekbarGreen.getProgress(), seekbarBlue.getProgress());
				colorLayout.setBackgroundColor(Color.parseColor(colorPicked));
				colorText.setText(colorPicked);
			}
			@Override
			public void onStartTrackingTouch(SeekBar a) {
			}
			@Override
			public void onStopTrackingTouch(SeekBar a) {
			}
		});
		seekbarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar a, int b, boolean c) {
				_convertColorPicked(seekbarRed.getProgress(), seekbarGreen.getProgress(), seekbarBlue.getProgress());
				colorLayout.setBackgroundColor(Color.parseColor(colorPicked));
				colorText.setText(colorPicked);
			}
			@Override
			public void onStartTrackingTouch(SeekBar a) {
			}
			@Override
			public void onStopTrackingTouch(SeekBar a) {
			}
		});
		seekbarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar a, int b, boolean c) {
				_convertColorPicked(seekbarRed.getProgress(), seekbarGreen.getProgress(), seekbarBlue.getProgress());
				colorLayout.setBackgroundColor(Color.parseColor(colorPicked));
				colorText.setText(colorPicked);
			}
			@Override
			public void onStartTrackingTouch(SeekBar a) {
			}
			@Override
			public void onStopTrackingTouch(SeekBar a) {
			}
		});
		final TextView pickButton = (TextView)
		convertView.findViewById(R.id.textview6);
		
		pickButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View a) {
				_convertColorPicked(seekbarRed.getProgress(), seekbarGreen.getProgress(), seekbarBlue.getProgress());
				cpDialog.dismiss();
			}
		});
	}
	private AlertDialog cpDialog;
	{
	}
	
	
	public void _HighlightTextView(final String _spanpcolor, final String _spanscolor, final String _spanncolor, final String _spanqcolor, final String _spanccolor, final TextView _spanableview) {
		_spanableview.setTypeface(Typeface.MONOSPACE);
		final TextView regex1 = new TextView(this);
		final TextView regex2 = new TextView(this);
		final TextView regex3 = new TextView(this);
		final TextView regex4 = new TextView(this);
		final TextView regex5 = new TextView(this);
		final TextView regex6 = new TextView(this);
		final TextView regex7 = new TextView(this);
		final TextView regex8 = new TextView(this);
		final TextView regex9 = new TextView(this);
		final TextView regex10 = new TextView(this);
		regex1.setText("(out|print|println|valueOf|toString|concat|equals|for|while|switch|getText");
		regex2.setText("|getIntent|getText|setText|getProgress|setProgress|setMax|setMin|make|getApplicationContext|setLayoutParams|layoutParams|makeText|showMessage|println|printf|print|out|parseInt|round|sqrt|charAt|compareTo|compareToIgnoreCase|concat|contains|contentEquals|equals|length|toLowerCase|trim|toUpperCase|toString|valueOf|substring|startsWith|split|replace|replaceAll|lastIndexOf|size)");
		regex3.setText("(public|private|protected|void|switch|case|class|import|package|extends|Activity|TextView|VideoView|EditText|LinearLayout|CharSequence|String|int|onCreate|ArrayList|float|if|else|static|Intent|Button|SharedPreferences");
		regex4.setText("|abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|interface|long|native|new|package|private|protected|");
		regex5.setText("public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while|true|false|null)");
		regex6.setText("([0-9]+)");
		regex7.setText("(\\w+)(\\()+");
		regex8.setText("\\@\\s*(\\w+)");
		regex9.setText("\"(.*?)\"|'(.*?)'");
		regex10.setText("/\\*(?:.|[\\n\\r])*?\\*/|//.*");
		final String secondaryColor = _spanscolor;
		final String primaryColor = _spanpcolor;
		final String numbersColor = _spanncolor;
		final String quotesColor = _spanqcolor;
		final String commentsColor = _spanccolor;
		_spanableview.addTextChangedListener(new TextWatcher() {
			ColorScheme keywords1 = new ColorScheme(java.util.regex.Pattern.compile(regex1.getText().toString().concat(regex2.getText().toString())), Color.parseColor(secondaryColor));
			ColorScheme keywords2 = new ColorScheme(java.util.regex.Pattern.compile(regex3.getText().toString().concat(regex4.getText().toString().concat(regex5.getText().toString()))), Color.parseColor(primaryColor));
			ColorScheme keywords3 = new ColorScheme(java.util.regex.Pattern.compile(regex6.getText().toString()), Color.parseColor(numbersColor));
			ColorScheme keywords4 = new ColorScheme(java.util.regex.Pattern.compile(regex7.getText().toString()), Color.parseColor(secondaryColor));
			ColorScheme keywords5 = new ColorScheme(java.util.regex.Pattern.compile(regex9.getText().toString()), Color.parseColor(quotesColor));
			ColorScheme keywords6 = new ColorScheme(java.util.regex.Pattern.compile(regex10.getText().toString()), Color.parseColor(commentsColor));
			ColorScheme keywords7 = new ColorScheme(java.util.regex.Pattern.compile(regex8.getText().toString()), Color.parseColor(numbersColor));
			final ColorScheme[] schemes = {keywords1, keywords2, keywords3, keywords4, keywords5, keywords6, keywords7};
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}
			@Override
			public void afterTextChanged(Editable s) {
				removeSpans(s, android.text.style.ForegroundColorSpan.class);
				for(ColorScheme scheme : schemes) {
					for(java.util.regex.Matcher m = scheme.pattern.matcher(s);
					m.find();) {
						if (scheme == keywords4) {
							s.setSpan(new android.text.style.ForegroundColorSpan(scheme.color), m.start(), m.end()-1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
						} else {
							s.setSpan(new android.text.style.ForegroundColorSpan(scheme.color), m.start(), m.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
						}
					}
				}
			}
			void removeSpans(Editable e, Class<? extends android.text.style.CharacterStyle> type) {
				android.text.style.CharacterStyle[] spans = e.getSpans(0, e.length(), type);
				for (android.text.style.CharacterStyle span : spans) {
					e.removeSpan(span);
				}
			}
			class ColorScheme {
				final java.util.regex.Pattern pattern;
				final int color;
				ColorScheme(java.util.regex.Pattern pattern, int color) {
					    this.pattern = pattern;
					this.color = color;
				}
			}
		});
	}
	
	
	public void _dialogColor(final AlertDialog.Builder _d, final String _color) {
		
	}
	
	
	public void _Toast(final String _text, final String _bg, final String _color) {
		Toast toast = Toast.makeText(CreateNotificationActivity.this, _text, 3000);
		View view = toast.getView();
		
		view.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, Color.parseColor(_bg)));
		
		
		TextView text = view.findViewById(android.R.id.message);
		text.setTextColor(Color.parseColor(_color));
		text.setShadowLayer(0,0,0,0);
		
		toast.show();
		
	}
	
	
	public void _invalidColorMessage() {
		
	}
	
	
	public void _fix_edittext() {
		edittext_fix(this,getWindow().getDecorView()); 
	} 
	private void edittext_fix(final android.content.Context context, final View v) {
		
		try {
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0;
				i < vg.getChildCount();
				i++) {
					View child = vg.getChildAt(i);
					edittext_fix(context, child);
				}
			}
			else {
				if ((v instanceof EditText)) {
					((EditText) v).setOnClickListener(new View.OnClickListener() {
										@Override
										public void onClick(View _view) {
												_fab.hide();
										}
								});
				}
				else {
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Something went wrong while getting things ready.");
		};
	}
	
	
	public void _collapsingToolbar(final View _scroll) {
		try {
				com.google.android.material.appbar.AppBarLayout.LayoutParams params = (com.google.android.material.appbar.AppBarLayout.LayoutParams)_toolbar.getLayoutParams();
				params.setScrollFlags(com.google.android.material.appbar.AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL | com.google.android.material.appbar.AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS | com.google.android.material.appbar.AppBarLayout.LayoutParams.SCROLL_FLAG_SNAP);
				androidx.core.widget.NestedScrollView nestedScrollView = new androidx.core.widget.NestedScrollView(this);
				
				LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
				nestedScrollView.setLayoutParams(layoutParams);
				androidx.core.view.ViewCompat.setNestedScrollingEnabled(_scroll, true);
		} catch(Exception e) {
		}
	}
	
	
	public void _convertColorPicked(final double _r, final double _g, final double _b) {
		colorPicked = "#".concat(String.format("%02X%02X%02X", new Object[]{
			Integer.valueOf((int)_r), Integer.valueOf((int)_g), Integer.valueOf((int)_b)
		}));
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
