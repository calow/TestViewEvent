package com.example.testviewevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

public class MyTextView extends TextView {

	
	public MyTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public MyTextView(Context context) {
		super(context);
		init();
	}

	public void init(){
		
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
//			getParent().requestDisallowInterceptTouchEvent(true);
			System.out.println("MyTextView dispatchTouchEvent ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
//			getParent().requestDisallowInterceptTouchEvent(false);
			System.out.println("MyTextView dispatchTouchEvent ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
//			getParent().requestDisallowInterceptTouchEvent(true);
			System.out.println("MyTextView dispatchTouchEvent ACTION_UP");
			break;
		default:
			break;
		}
		return super.dispatchTouchEvent(event);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			System.out.println("MyTextView onTouchEvent ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			System.out.println("MyTextView onTouchEvent ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
			System.out.println("MyTextView onTouchEvent ACTION_UP");
			break;
		default:
			break;
		}
		return true;
	}
	
	

}
