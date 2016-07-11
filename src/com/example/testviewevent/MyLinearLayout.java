package com.example.testviewevent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

@SuppressLint("NewApi")
public class MyLinearLayout extends LinearLayout {

	
	public MyLinearLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public MyLinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public MyLinearLayout(Context context) {
		super(context);
		init();
	}

	public void init() {
		
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		boolean intercepte = false;
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			intercepte = false;
			System.out.println("MyLinearLayout onInterceptTouchEvent ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			intercepte = true;
			System.out.println("MyLinearLayout onInterceptTouchEvent ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
			intercepte = false;
			System.out.println("MyLinearLayout onInterceptTouchEvent ACTION_UP");
			break;
		default:
			break;
		}
		return intercepte;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			System.out.println("MyLinearLayout onTouchEvent ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			System.out.println("MyLinearLayout onTouchEvent ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
			System.out.println("MyLinearLayout onTouchEvent ACTION_UP");
			break;
		default:
			break;
		}
		return true;
	}
	
	

}
