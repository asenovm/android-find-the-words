package com.asenovm.words.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public abstract class TypefacedTextView extends TextView {

	public TypefacedTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		final Typeface typeface = Typeface.createFromAsset(context.getAssets(),
				getFontPath());
		setTypeface(typeface);
	}

	public TypefacedTextView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public TypefacedTextView(Context context) {
		this(context, null);
	}

	protected abstract String getFontPath();

}
