package com.asenovm.words.views;

import android.content.Context;
import android.util.AttributeSet;

public class RobotoThinTextView extends TypefacedTextView {

	public RobotoThinTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public RobotoThinTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public RobotoThinTextView(Context context) {
		super(context);
	}

	@Override
	protected String getFontPath() {
		return "fonts/roboto_thin.ttf";
	}

}
