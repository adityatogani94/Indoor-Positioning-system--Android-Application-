package com.example.w.a.y;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements AnimationListener {
	Animation animfade, animmove, animout;
	ImageView iv2,iv3,iv4,iv5,iv6,ivtwo,ivthree,ivfour,ivfive,ivsix,ivseven,iveight;
	EditText ed1,ed2;
	TextView tv1,tv2;
	Button bt1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		animfade = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
		animfade.setAnimationListener(this);
		animout = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);
		animout.setAnimationListener(this);
		ed1 = (EditText) findViewById(R.id.editText1);
		ed2 = (EditText) findViewById(R.id.editText2);
		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		bt1 = (Button) findViewById(R.id.button1);
		//iv2.setVisibility(View.INVISIBLE);
		ed1.setVisibility(View.VISIBLE);
		ed2.setVisibility(View.VISIBLE);
		tv1.setVisibility(View.VISIBLE);
		tv2.setVisibility(View.VISIBLE);
		bt1.setVisibility(View.VISIBLE);
		ed1.startAnimation(animfade);
        ed2.startAnimation(animfade);
        tv1.startAnimation(animfade);
        tv2.startAnimation(animfade);
        bt1.startAnimation(animfade);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void firsttrans(View v)
	{
		/*ed1.startAnimation(animout);
        ed2.startAnimation(animout);
        tv1.startAnimation(animout);
        tv2.startAnimation(animout);
        bt1.startAnimation(animout);*/
        setContentView(R.layout.page1);
        iv2 = (ImageView) findViewById(R.id.imageView2);
		
		iv2.setVisibility(View.VISIBLE);
        iv2.startAnimation(animfade);
	}
	public void maps(View v)
	{
		setContentView(R.layout.floors);
		/*iv3 = (ImageView) findViewById(R.id.imageView3);
		iv4 = (ImageView) findViewById(R.id.imageView4);
		iv5 = (ImageView) findViewById(R.id.ImageView05);
		animmove = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);
		animmove.setAnimationListener(this);
        // start the animation
		iv3.setVisibility(View.VISIBLE);
        iv3.startAnimation(animmove);
        iv4.setVisibility(View.VISIBLE);
        iv4.startAnimation(animmove);
        iv5.setVisibility(View.VISIBLE);
        iv5.startAnimation(animmove);*/
	}
	
	public void floor1(View v)
	{
		setContentView(R.layout.floor1);
		iv6 = (ImageView) findViewById(R.id.imageView6);
		iv6.setOnTouchListener(new Touch());
		
	}
	public void floor2(View v)
	{
		setContentView(R.layout.floor2);
		ivtwo = (ImageView) findViewById(R.id.imageViewtwo);
		ivtwo.setOnTouchListener(new Touch());
		
	}
	public void floor3(View v)
	{
		setContentView(R.layout.floor3);
		ivthree = (ImageView) findViewById(R.id.imageViewthree);
		ivthree.setOnTouchListener(new Touch());
		
	}
	public void floor4(View v)
	{
		setContentView(R.layout.floor4);
		ivfour = (ImageView) findViewById(R.id.imageViewfour);
		ivfour.setOnTouchListener(new Touch());
		
	}
	public void floor5(View v)
	{
		setContentView(R.layout.floor5);
		ivfive = (ImageView) findViewById(R.id.imageViewfive);
		ivfive.setOnTouchListener(new Touch());
		
	}
	public void floor6(View v)
	{
		setContentView(R.layout.floor6);
		ivsix = (ImageView) findViewById(R.id.imageViewsix);
		ivsix.setOnTouchListener(new Touch());
		
	}
	public void floor7(View v)
	{
		setContentView(R.layout.floor7);
		ivseven = (ImageView) findViewById(R.id.imageViewseven);
		ivseven.setOnTouchListener(new Touch());
		
	}
	public void floor8(View v)
	{
		setContentView(R.layout.floor8);
		iveight = (ImageView) findViewById(R.id.imageVieweight);
		iveight.setOnTouchListener(new Touch());
		
	}
	
	@Override
	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub
		
	}
}
