package com.my.uikit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.facebook.shimmer.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.MobileAds;


public class CreateDesignActivity extends AppCompatActivity {
	
	private FloatingActionButton _fab;
	private double strk = 0;
	private double TR = 0;
	private double BR_N = 0;
	private double BL_N = 0;
	private double TL_N = 0;
	private double elevation_n = 0;
	private double height_n = 0;
	private double width = 0;
	private String background_color = "";
	private String stroke_color = "";
	private String ripple_color = "";
	private String color1_gradient = "";
	private String color2_gradient = "";
	private double n_typeColor = 0;
	private boolean isFloatingOpen = false;
	private String string_FloatClick = "";
	private String Code2Copy = "";
	private String Real_Code = "";
	private String typo_gradient = "";
	private String colorPicked = "";
	
	private ArrayList<String> gradient_types = new ArrayList<>();
	
	private LinearLayout bg;
	private LinearLayout linear2;
	private LinearLayout cod;
	private LinearLayout base;
	private LinearLayout trash;
	private LinearLayout layout1;
	private LinearLayout layout2;
	private LinearLayout layout3;
	private LinearLayout l1;
	private ScrollView layout1_scroll;
	private LinearLayout layout1_linearBg;
	private LinearLayout width_controller;
	private LinearLayout height_controller;
	private LinearLayout linear_background_bg;
	private LinearLayout elevat;
	private LinearLayout viewid_bg;
	private LinearLayout btn_copy;
	private AdView adview1;
	private ImageView img_width;
	private SeekBar width_seek;
	private TextView width_layout1_text;
	private ImageView img_height;
	private SeekBar height;
	private TextView height_text_layout1;
	private TextView textview3;
	private LinearLayout select_background_color;
	private TextView text_background_color;
	private LinearLayout eleva_line;
	private SeekBar seekbar1;
	private TextView elevation_text;
	private TextView textview5;
	private EditText edittext1;
	private TextView textview6;
	private ScrollView vscroll2;
	private LinearLayout linear15;
	private LinearLayout TR_BG;
	private LinearLayout BR;
	private LinearLayout BL;
	private LinearLayout TL;
	private LinearLayout TLBR;
	private ImageView imageview1;
	private SeekBar tr;
	private TextView T1;
	private ImageView imageview2;
	private SeekBar br;
	private TextView T2;
	private ImageView imageview3;
	private SeekBar bl;
	private TextView T3;
	private ImageView imageview4;
	private SeekBar tl;
	private TextView T4;
	private ImageView imageview5;
	private SeekBar trbl;
	private TextView T5;
	private ScrollView vscroll1;
	private LinearLayout linear5;
	private LinearLayout stk;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private ImageView imageview7;
	private TextView textview7;
	private SeekBar strk_pg;
	private TextView stroke_xolor_txy;
	private TextView textview8;
	private LinearLayout strk_color_line;
	private TextView ripple_color_txt;
	private CheckBox checkbox1;
	private LinearLayout ripple_bg_true;
	private TextView textview9;
	private LinearLayout ripple_color_bg;
	private TextView textview10;
	private LinearLayout linear10;
	private LinearLayout bg_colors_gradient;
	private CheckBox checkbox3;
	private LinearLayout type_gradient_bt;
	private TextView textview17;
	private Spinner spinner1;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear14;
	private TextView textview18;
	private LinearLayout gradient_color_1;
	private LinearLayout gradient_color_2;
	private ImageView imageview6;
	private TextView gradient_color_1_txt;
	private TextView gradient_color2_txt;
	
	private AlertDialog.Builder dia;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.create_design);
		initialize(_savedInstanceState);
		
		com.google.android.gms.ads.MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_fab = findViewById(R.id._fab);
		
		bg = findViewById(R.id.bg);
		linear2 = findViewById(R.id.linear2);
		cod = findViewById(R.id.cod);
		base = findViewById(R.id.base);
		trash = findViewById(R.id.trash);
		layout1 = findViewById(R.id.layout1);
		layout2 = findViewById(R.id.layout2);
		layout3 = findViewById(R.id.layout3);
		l1 = findViewById(R.id.l1);
		layout1_scroll = findViewById(R.id.layout1_scroll);
		layout1_linearBg = findViewById(R.id.layout1_linearBg);
		width_controller = findViewById(R.id.width_controller);
		height_controller = findViewById(R.id.height_controller);
		linear_background_bg = findViewById(R.id.linear_background_bg);
		elevat = findViewById(R.id.elevat);
		viewid_bg = findViewById(R.id.viewid_bg);
		btn_copy = findViewById(R.id.btn_copy);
		adview1 = findViewById(R.id.adview1);
		img_width = findViewById(R.id.img_width);
		width_seek = findViewById(R.id.width_seek);
		width_layout1_text = findViewById(R.id.width_layout1_text);
		img_height = findViewById(R.id.img_height);
		height = findViewById(R.id.height);
		height_text_layout1 = findViewById(R.id.height_text_layout1);
		textview3 = findViewById(R.id.textview3);
		select_background_color = findViewById(R.id.select_background_color);
		text_background_color = findViewById(R.id.text_background_color);
		eleva_line = findViewById(R.id.eleva_line);
		seekbar1 = findViewById(R.id.seekbar1);
		elevation_text = findViewById(R.id.elevation_text);
		textview5 = findViewById(R.id.textview5);
		edittext1 = findViewById(R.id.edittext1);
		textview6 = findViewById(R.id.textview6);
		vscroll2 = findViewById(R.id.vscroll2);
		linear15 = findViewById(R.id.linear15);
		TR_BG = findViewById(R.id.TR_BG);
		BR = findViewById(R.id.BR);
		BL = findViewById(R.id.BL);
		TL = findViewById(R.id.TL);
		TLBR = findViewById(R.id.TLBR);
		imageview1 = findViewById(R.id.imageview1);
		tr = findViewById(R.id.tr);
		T1 = findViewById(R.id.T1);
		imageview2 = findViewById(R.id.imageview2);
		br = findViewById(R.id.br);
		T2 = findViewById(R.id.T2);
		imageview3 = findViewById(R.id.imageview3);
		bl = findViewById(R.id.bl);
		T3 = findViewById(R.id.T3);
		imageview4 = findViewById(R.id.imageview4);
		tl = findViewById(R.id.tl);
		T4 = findViewById(R.id.T4);
		imageview5 = findViewById(R.id.imageview5);
		trbl = findViewById(R.id.trbl);
		T5 = findViewById(R.id.T5);
		vscroll1 = findViewById(R.id.vscroll1);
		linear5 = findViewById(R.id.linear5);
		stk = findViewById(R.id.stk);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear6 = findViewById(R.id.linear6);
		imageview7 = findViewById(R.id.imageview7);
		textview7 = findViewById(R.id.textview7);
		strk_pg = findViewById(R.id.strk_pg);
		stroke_xolor_txy = findViewById(R.id.stroke_xolor_txy);
		textview8 = findViewById(R.id.textview8);
		strk_color_line = findViewById(R.id.strk_color_line);
		ripple_color_txt = findViewById(R.id.ripple_color_txt);
		checkbox1 = findViewById(R.id.checkbox1);
		ripple_bg_true = findViewById(R.id.ripple_bg_true);
		textview9 = findViewById(R.id.textview9);
		ripple_color_bg = findViewById(R.id.ripple_color_bg);
		textview10 = findViewById(R.id.textview10);
		linear10 = findViewById(R.id.linear10);
		bg_colors_gradient = findViewById(R.id.bg_colors_gradient);
		checkbox3 = findViewById(R.id.checkbox3);
		type_gradient_bt = findViewById(R.id.type_gradient_bt);
		textview17 = findViewById(R.id.textview17);
		spinner1 = findViewById(R.id.spinner1);
		hscroll1 = findViewById(R.id.hscroll1);
		linear14 = findViewById(R.id.linear14);
		textview18 = findViewById(R.id.textview18);
		gradient_color_1 = findViewById(R.id.gradient_color_1);
		gradient_color_2 = findViewById(R.id.gradient_color_2);
		imageview6 = findViewById(R.id.imageview6);
		gradient_color_1_txt = findViewById(R.id.gradient_color_1_txt);
		gradient_color2_txt = findViewById(R.id.gradient_color2_txt);
		dia = new AlertDialog.Builder(this);
		
		width_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				width_layout1_text.setText("+ ".concat(String.valueOf((long)(_progressValue))).concat("dp"));
				_refreshView();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		height.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				height_text_layout1.setText("+ ".concat(String.valueOf((long)(_progressValue))).concat("dp"));
				_refreshView();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		select_background_color.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				n_typeColor = 0;
				_pickColor();
			}
		});
		
		seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				elevation_text.setText("+ ".concat(String.valueOf((long)(_progressValue))).concat("dp"));
				_refreshView();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		tr.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				T1.setText("+ ".concat(String.valueOf((long)(_progressValue)).concat("dp")));
				_refreshView();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		T1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tr.setProgress((int)tr.getProgress() + 1);
			}
		});
		
		br.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				T2.setText("+ ".concat(String.valueOf((long)(_progressValue))).concat("dp"));
				_refreshView();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		T2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				br.setProgress((int)br.getProgress() + 1);
			}
		});
		
		bl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				T3.setText("+ ".concat(String.valueOf((long)(_progressValue))).concat("dp"));
				_refreshView();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		T3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				bl.setProgress((int)bl.getProgress() + 1);
			}
		});
		
		tl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				T4.setText("+ ".concat(String.valueOf((long)(_progressValue))).concat("dp"));
				_refreshView();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		T4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tl.setProgress((int)tl.getProgress() + 1);
			}
		});
		
		trbl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				tr.setProgress((int)_progressValue);
				br.setProgress((int)_progressValue);
				bl.setProgress((int)_progressValue);
				tl.setProgress((int)_progressValue);
				T5.setText("+ ".concat(String.valueOf((long)(_progressValue))).concat("dp"));
				_refreshView();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		T5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				trbl.setProgress((int)trbl.getProgress() + 1);
			}
		});
		
		strk_pg.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				stroke_xolor_txy.setText("+ ".concat(String.valueOf((long)(_progressValue))).concat("dp"));
				_refreshView();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		stroke_xolor_txy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				strk_pg.setProgress((int)strk_pg.getProgress() + 1);
			}
		});
		
		strk_color_line.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				n_typeColor = 1;
				_pickColor();
			}
		});
		
		ripple_color_txt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				n_typeColor = 2;
				_pickColor();
			}
		});
		
		checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					ripple_bg_true.setVisibility(View.VISIBLE);
				}
				else {
					ripple_bg_true.setVisibility(View.GONE);
				}
				_refreshView();
			}
		});
		
		checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					bg_colors_gradient.setVisibility(View.VISIBLE);
					type_gradient_bt.setVisibility(View.VISIBLE);
				}
				else {
					bg_colors_gradient.setVisibility(View.GONE);
					type_gradient_bt.setVisibility(View.GONE);
				}
				_refreshView();
			}
		});
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				typo_gradient = gradient_types.get((int)(_position));
				_refreshView();
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		gradient_color_1_txt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				n_typeColor = 3;
				_pickColor();
			}
		});
		
		gradient_color2_txt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				n_typeColor = 4;
				_pickColor();
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				strk = strk_pg.getProgress();
				TR = tr.getProgress();
				BR_N = br.getProgress();
				BL_N = bl.getProgress();
				TL_N = tl.getProgress();
				elevation_n = seekbar1.getProgress();
				height_n = height.getProgress();
				width = width_seek.getProgress();
				background_color = text_background_color.getText().toString();
				stroke_color = ripple_color_txt.getText().toString();
				ripple_color = textview10.getText().toString();
				_refreshView();
				if (!edittext1.getText().toString().trim().equals("")) {
					if (checkbox1.isChecked()) {
						if (checkbox3.isChecked()) {
							Real_Code = "{\nandroid.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();\nint d = (int) getApplicationContext().getResources().getDisplayMetrics().density;\nint clrs [] = {%color1_gradient%,%color2_gradient%};\nSketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.%typeGradient%, clrs);\nSketchUi.setCornerRadii(new float[]{d*n4,d*n4,d*n1 ,d*n1,d*n2,d*n2 ,d*n3,d*n3});\nSketchUi.setStroke(d*n5,%stroke_color%);\n%view%.setElevation(d*n6);\nandroid.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{%ripple_color%}), SketchUi, null);\n%view%.setBackground(SketchUiRD);\n%view%.setClickable(true);\n}";
							Code2Copy = Real_Code.replace("%view%", edittext1.getText().toString().trim());
							Code2Copy = Code2Copy.replace("%color1_gradient%", gradient_color_1_txt.getText().toString().replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("%color2_gradient%", gradient_color2_txt.getText().toString().replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("%typeGradient%", typo_gradient);
							Code2Copy = Code2Copy.replace("%stroke_color%", stroke_color.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("%ripple_color%", ripple_color.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("*n1", "*".concat(String.valueOf((long)(TR))));
							Code2Copy = Code2Copy.replace("*n2", "*".concat(String.valueOf((long)(BR_N))));
							Code2Copy = Code2Copy.replace("*n3", "*".concat(String.valueOf((long)(BL_N))));
							Code2Copy = Code2Copy.replace("*n4", "*".concat(String.valueOf((long)(TL_N))));
							Code2Copy = Code2Copy.replace("*n5", "*".concat(String.valueOf((long)(strk))));
							Code2Copy = Code2Copy.replace("*n6", "*".concat(String.valueOf((long)(elevation_n))));
							dia.setTitle("Code");
							dia.setMessage(Code2Copy);
							dia.setPositiveButton("Copy", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", Code2Copy));
									SketchwareUtil.showMessage(getApplicationContext(), "CODE COPIED");
								}
							});
							dia.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							dia.create().show();
						}
						else {
							Real_Code = "{\nandroid.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();\nint d = (int) getApplicationContext().getResources().getDisplayMetrics().density;\nSketchUi.setColor(%background_color%);SketchUi.setCornerRadii(new float[]{d*n4,d*n4,d*n1 ,d*n1,d*n2,d*n2 ,d*n3,d*n3});\nSketchUi.setStroke(d*n5,%stroke_color%);\n%view%.setElevation(d*n6);\nandroid.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{%ripple_color%}), SketchUi, null);\n%view%.setBackground(SketchUiRD);\n%view%.setClickable(true);\n}";
							Code2Copy = Real_Code.replace("%view%", edittext1.getText().toString().trim());
							Code2Copy = Code2Copy.replace("%background_color%", background_color.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("%stroke_color%", stroke_color.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("%ripple_color%", ripple_color.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("*n1", "*".concat(String.valueOf((long)(TR))));
							Code2Copy = Code2Copy.replace("*n2", "*".concat(String.valueOf((long)(BR_N))));
							Code2Copy = Code2Copy.replace("*n3", "*".concat(String.valueOf((long)(BL_N))));
							Code2Copy = Code2Copy.replace("*n4", "*".concat(String.valueOf((long)(TL_N))));
							Code2Copy = Code2Copy.replace("*n5", "*".concat(String.valueOf((long)(strk))));
							Code2Copy = Code2Copy.replace("*n6", "*".concat(String.valueOf((long)(elevation_n))));
							dia.setTitle("Code");
							dia.setMessage(Code2Copy);
							dia.setPositiveButton("Copy", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", Code2Copy));
									SketchwareUtil.showMessage(getApplicationContext(), "CODE COPIED");
								}
							});
							dia.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							dia.create().show();
						}
					}
					else {
						if (checkbox3.isChecked()) {
							Real_Code = "{\nandroid.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();\nint d = (int) getApplicationContext().getResources().getDisplayMetrics().density;\nint clrs [] = {%color1_gradient%,%color2_gradient%};\nSketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.%typeGradient%, clrs);\nSketchUi.setCornerRadii(new float[]{\nd*n4,d*n4,d*n1 ,d*n1,d*n2,d*n2 ,d*n3,d*n3});\nSketchUi.setStroke(d*n5,%stroke_color%);\n%view%.setElevation(d*n6);\n%view%.setBackground(SketchUi);\n%view%.setClickable(true);\n}";
							Code2Copy = Real_Code.replace("%view%", edittext1.getText().toString().trim());
							Code2Copy = Code2Copy.replace("%color1_gradient%", color1_gradient.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("%color2_gradient%", color2_gradient.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("%typeGradient%", typo_gradient);
							Code2Copy = Code2Copy.replace("%stroke_color%", stroke_color.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("%ripple_color%", ripple_color.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("*n1", "*".concat(String.valueOf((long)(TR))));
							Code2Copy = Code2Copy.replace("*n2", "*".concat(String.valueOf((long)(BR_N))));
							Code2Copy = Code2Copy.replace("*n3", "*".concat(String.valueOf((long)(BL_N))));
							Code2Copy = Code2Copy.replace("*n4", "*".concat(String.valueOf((long)(TL_N))));
							Code2Copy = Code2Copy.replace("*n5", "*".concat(String.valueOf((long)(strk))));
							Code2Copy = Code2Copy.replace("*n6", "*".concat(String.valueOf((long)(elevation_n))));
							dia.setTitle("Code");
							dia.setMessage(Code2Copy);
							dia.setPositiveButton("Copy", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", Code2Copy));
									SketchwareUtil.showMessage(getApplicationContext(), "CODE COPIED");
								}
							});
							dia.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							dia.create().show();
						}
						else {
							Real_Code = "{\nandroid.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();\nint d = (int) getApplicationContext().getResources().getDisplayMetrics().density;\nSketchUi.setColor(%background_color%);SketchUi.setCornerRadii(new float[]{\nd*n4,d*n4,d*n1 ,d*n1,d*n2,d*n2 ,d*n3,d*n3});\nSketchUi.setStroke(d*n5,%stroke_color%);\n%view%.setElevation(d*n6);\n%view%.setBackground(SketchUi);\n}";
							Code2Copy = Real_Code.replace("%view%", edittext1.getText().toString().trim());
							Code2Copy = Code2Copy.replace("%background_color%", background_color.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("%stroke_color%", stroke_color.replace("#", "0xFF"));
							Code2Copy = Code2Copy.replace("*n1", "*".concat(String.valueOf((long)(TR))));
							Code2Copy = Code2Copy.replace("*n2", "*".concat(String.valueOf((long)(BR_N))));
							Code2Copy = Code2Copy.replace("*n3", "*".concat(String.valueOf((long)(BL_N))));
							Code2Copy = Code2Copy.replace("*n4", "*".concat(String.valueOf((long)(TL_N))));
							Code2Copy = Code2Copy.replace("*n5", "*".concat(String.valueOf((long)(strk))));
							Code2Copy = Code2Copy.replace("*n6", "*".concat(String.valueOf((long)(elevation_n))));
							dia.setTitle("Code");
							dia.setMessage(Code2Copy);
							dia.setPositiveButton("Copy", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", Code2Copy));
									SketchwareUtil.showMessage(getApplicationContext(), "CODE COPIED");
								}
							});
							dia.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							dia.create().show();
						}
					}
				}
				else {
					((EditText)edittext1).setError("FIELD REQUIRED");
					SketchwareUtil.showMessage(getApplicationContext(), "VIEW ID REQUIRED");
				}
			}
		});
	}
	
	private void initializeLogic() {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF000000);
			SketchUi.setCornerRadius(d*8);
			btn_copy.setElevation(d*5);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			btn_copy.setBackground(SketchUiRD);
			btn_copy.setClickable(true);
		}
		select_background_color.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)8, (int)1, 0xFF000000, 0xFFFFFFFF));
		eleva_line.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)8, (int)1, 0xFF000000, 0xFFFFFFFF));
		eleva_line.setElevation((float)5);
		strk_color_line.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)8, (int)1, 0xFF000000, 0xFF008DCD));
		ripple_color_bg.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)8, (int)1, 0xFF000000, 0xFFE0E0E0));
		type_gradient_bt.setVisibility(View.GONE);
		bg_colors_gradient.setVisibility(View.GONE);
		gradient_types.add("TOP_BOTTOM");
		gradient_types.add("TR_BL");
		gradient_types.add("RIGHT_LEFT");
		gradient_types.add("BR_TL");
		gradient_types.add("BOTTOM_TOP");
		gradient_types.add("BL_TR");
		gradient_types.add("LEFT_RIGHT");
		gradient_types.add("TL_BR");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, gradient_types));
		((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
		_refreshView();
		_tablayout();
		imageview7.setVisibility(View.GONE);
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
	public void _DARK_ICONS() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		
		
		/*Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#FFFFFF"));*/
		
		getWindow().setNavigationBarColor(Color.parseColor("#FFFFFF"));
		
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
	}
	
	
	public void _tablayout() {
		viewPager = new androidx.viewpager.widget.ViewPager(this);
		 viewPager.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
		 MyPagerAdapter adapter = new MyPagerAdapter();
		 viewPager.setAdapter(adapter);
		 viewPager.setCurrentItem(0);
		 base.addView(viewPager);
		
		 tabLayout = new com.google.android.material.tabs.TabLayout(this);
		
		tabLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
		 tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
		 tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#000000"));
		 tabLayout.setTabTextColors(Color.parseColor("#000000"), Color.parseColor("#000000"));
		
		 tabLayout.setupWithViewPager(viewPager);
		 cod.addView(tabLayout);
		cod.setElevation(0f);
		
		 }
	 
	 private androidx.viewpager.widget.ViewPager viewPager;
	 private com.google.android.material.tabs.TabLayout tabLayout;
	
	 private class MyPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
		  public int getCount() {
			   return 3;
			
			  }
		
		  @Override public Object instantiateItem(ViewGroup collection, int position) {
			   LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			   View v = inflater.inflate(R.layout.empty, null);
			   LinearLayout container = (LinearLayout) v.findViewById(R.id.linear1);
			
			   if (position == 0) {
				    ViewGroup parent = (ViewGroup) layout1.getParent();
				    if (parent != null) {
					     parent.removeView(layout1);
					    }container.addView(layout1);} 
			
			   else if (position == 1) {
				    ViewGroup parent = (ViewGroup) layout2.getParent();
				    if (parent != null) {
					     parent.removeView(layout2);
					    }
				    container.addView(layout2);}
			
			else if (position == 2) {
				    ViewGroup parent = (ViewGroup) layout3.getParent();
				    if (parent != null) {
					     parent.removeView(layout3);
					    }
				    container.addView(layout3);}
			    
			   collection.addView(v, 0);
			   return v;
			  }
		  @Override public void destroyItem(ViewGroup collection, int position, Object view) {
			   collection.removeView((View) view);
			   trash.addView((View) view);
			  }
		  @Override public CharSequence getPageTitle(int position) {
			   switch (position) {
				    case 0:
				     return "BASIC";
				    case 1:
				     return "CORNERS";
				    case 2 :
				      return "MORE";
				    default:
				     return null;
				   }
			
			  }
		  @Override public boolean isViewFromObject(View arg0, Object arg1) {
			   return arg0 == ((View) arg1);}
		  @Override public Parcelable saveState() {
			   return null;
			  }
		 }
	 {
	}
	
	
	public void _refreshView() {
		strk = strk_pg.getProgress();
		TR = tr.getProgress();
		BR_N = br.getProgress();
		BL_N = bl.getProgress();
		TL_N = tl.getProgress();
		elevation_n = seekbar1.getProgress();
		height_n = height.getProgress();
		width = width_seek.getProgress();
		background_color = text_background_color.getText().toString();
		stroke_color = ripple_color_txt.getText().toString();
		ripple_color = textview10.getText().toString();
		color1_gradient = gradient_color_1_txt.getText().toString();
		color2_gradient = gradient_color2_txt.getText().toString();
		int n11 = (int)strk;
		float n12 = (float)TR;
		float n13 = (float)BR_N;
		float n14 = (float)BL_N;
		float n15 = (float)TL_N;
		float n16 = (float)elevation_n;
		l1.getLayoutParams().height = (int)(SketchwareUtil.getDip(getApplicationContext(), (int)(height_n)));
			l1.getLayoutParams().width = (int)(SketchwareUtil.getDip(getApplicationContext(), (int)(width)));
			l1.requestLayout();
		if (checkbox1.isChecked()) {
			if (checkbox3.isChecked()) {
				int n1 = (int)TR;
					int n2 = (int)BR_N;
					int n3 = (int)BL_N;
					int n4 = (int)TL_N;
					int n5 = (int)strk;
				  int n6 = (int)elevation_n;
					{
							android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
							int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
						
					int clrs [] = {Color.parseColor(color1_gradient),Color.parseColor(color2_gradient)};
					switch((int)spinner1.getSelectedItemPosition()) {
						case ((int)0): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, clrs);
							break;
						}
						case ((int)1): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TR_BL, clrs);
							break;
						}
						case ((int)2): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, clrs);
							break;
						}
						case ((int)3): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BR_TL, clrs);
							break;
						}
						case ((int)4): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, clrs);
							break;
						}
						case ((int)5): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BL_TR, clrs);
							break;
						}
						case ((int)6): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
							break;
						}
						case ((int)7): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TL_BR, clrs);
							break;
						}
					}
					
					
					SketchUi.setCornerRadii(new float[]{
									d*n4,d*n4,d*n1 ,d*n1,d*n2,d*n2 ,d*n3,d*n3});
						SketchUi.setStroke(d*n5,Color.parseColor(stroke_color));
							l1.setElevation(d*n6);
							android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor(ripple_color)}), SketchUi, null);
							l1.setBackground(SketchUiRD);
							l1.setClickable(true);
					}
			}
			else {
				int n1 = (int)TR;
					int n2 = (int)BR_N;
					int n3 = (int)BL_N;
					int n4 = (int)TL_N;
					int n5 = (int)strk;
				  int n6 = (int)elevation_n;
					{
							android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
							int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
							SketchUi.setColor(Color.parseColor(background_color));SketchUi.setCornerRadii(new float[]{
									d*n4,d*n4,d*n1 ,d*n1,d*n2,d*n2 ,d*n3,d*n3});
							SketchUi.setStroke(d*n5,Color.parseColor(stroke_color));
							l1.setElevation(d*n6);
							android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor(ripple_color)}), SketchUi, null);
							l1.setBackground(SketchUiRD);
							l1.setClickable(true);
					}
			}
		}
		else {
			if (checkbox3.isChecked()) {
				int n1 = (int)TR;
					int n2 = (int)BR_N;
					int n3 = (int)BL_N;
					int n4 = (int)TL_N;
					int n5 = (int)strk;
				  int n6 = (int)elevation_n;
					{
							android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
							int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
						
					int clrs [] = {Color.parseColor(color1_gradient),Color.parseColor(color2_gradient)};
					switch((int)spinner1.getSelectedItemPosition()) {
						case ((int)0): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, clrs);
							break;
						}
						case ((int)1): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TR_BL, clrs);
							break;
						}
						case ((int)2): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, clrs);
							break;
						}
						case ((int)3): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BR_TL, clrs);
							break;
						}
						case ((int)4): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, clrs);
							break;
						}
						case ((int)5): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BL_TR, clrs);
							break;
						}
						case ((int)6): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
							break;
						}
						case ((int)7): {
							SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TL_BR, clrs);
							break;
						}
					}
					
					
					SketchUi.setCornerRadii(new float[]{
									d*n4,d*n4,d*n1 ,d*n1,d*n2,d*n2 ,d*n3,d*n3});
						SketchUi.setStroke(d*n5,Color.parseColor(stroke_color));
							l1.setElevation(d*n6);
							l1.setBackground(SketchUi);
							l1.setClickable(true);
					}
			}
			else {
				int n1 = (int)TR;
					int n2 = (int)BR_N;
					int n3 = (int)BL_N;
					int n4 = (int)TL_N;
					int n5 = (int)strk;
				  int n6 = (int)elevation_n;
				
				{
					android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
					int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
					SketchUi.setColor(Color.parseColor(background_color));SketchUi.setCornerRadii(new float[]{
						d*n4,d*n4,d*n1 ,d*n1,d*n2,d*n2 ,d*n3,d*n3});
					SketchUi.setStroke(d*n5,Color.parseColor(stroke_color));
					l1.setElevation(d*n6);
					l1.setBackground(SketchUi);
				}
			}
		}
	}
	
	
	public void _init() {
		cpDialog = new AlertDialog.Builder(CreateDesignActivity.this).create();
		
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
				_onColorPicked(colorPicked);
				cpDialog.dismiss();
			}
		});
	}
	private AlertDialog cpDialog;
	{
	}
	
	
	public void _pickColor() {
		_init();
		cpDialog.show();
	}
	
	
	public void _onColorPicked(final String _color) {
		if (n_typeColor == 0) {
			select_background_color.setBackgroundColor(Color.parseColor(_color));
			text_background_color.setText(_color);
		}
		if (n_typeColor == 1) {
			strk_color_line.setBackgroundColor(Color.parseColor(_color));
			ripple_color_txt.setText(_color);
		}
		if (n_typeColor == 2) {
			ripple_color_bg.setBackgroundColor(Color.parseColor(_color));
			textview10.setText(_color);
		}
		if (n_typeColor == 3) {
			gradient_color_1.setBackgroundColor(Color.parseColor(_color));
			gradient_color_1_txt.setText(_color);
		}
		if (n_typeColor == 4) {
			gradient_color_2.setBackgroundColor(Color.parseColor(_color));
			gradient_color2_txt.setText(_color);
		}
		_refreshView();
	}
	
	
	public void _convertColorPicked(final double _r, final double _g, final double _b) {
		colorPicked = "#".concat(String.format("%02X%02X%02X", new Object[]{
			Integer.valueOf((int)_r), Integer.valueOf((int)_g), Integer.valueOf((int)_b)
		}));
	}
	
	
	public void _FloatingWindow() {
		
		
		
		 }
	 
	 private androidx.viewpager.widget.ViewPager viewPager1;
	 private com.google.android.material.tabs.TabLayout tabLayout1;
	
	 private class MyPager1Adapter extends androidx.viewpager.widget.PagerAdapter {
		  public int getCount() {
				   return 3;
				
				  }
		
		  @Override public Object instantiateItem(ViewGroup collection, int position) {
				   LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				   View v = inflater.inflate(R.layout.empty, null);
				   LinearLayout container = (LinearLayout) v.findViewById(R.id.linear1);
				
				   if (position == 0) {
						    ViewGroup parent = (ViewGroup) layout1.getParent();
						    if (parent != null) {
								     parent.removeView(layout1);
								    }container.addView(layout1);} 
				
				   else if (position == 1) {
						    ViewGroup parent = (ViewGroup) layout2.getParent();
						    if (parent != null) {
								     parent.removeView(layout2);
								    }
						    container.addView(layout2);}
				
				else if (position == 2) {
						    ViewGroup parent = (ViewGroup) layout3.getParent();
						    if (parent != null) {
								     parent.removeView(layout3);
								    }
						    container.addView(layout3);}
				    
				   collection.addView(v, 0);
				   return v;
				  }
		  @Override public void destroyItem(ViewGroup collection, int position, Object view) {
				   collection.removeView((View) view);
				   trash.addView((View) view);
				  }
		  @Override public CharSequence getPageTitle(int position) {
				   switch (position) {
						    case 0:
						     return "BASIC";
						    case 1:
						     return "CORNERS";
						    case 2 :
						      return "MORE";
						    default:
						     return null;
						   }
				
				  }
		  @Override public boolean isViewFromObject(View arg0, Object arg1) {
				   return arg0 == ((View) arg1);}
		  @Override public Parcelable saveState() {
				   return null;
				  }
		 }
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
