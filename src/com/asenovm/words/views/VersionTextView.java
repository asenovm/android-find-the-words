package com.asenovm.words.views;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.AttributeSet;
import android.util.Log;

public class VersionTextView extends RobotoThinTextView {

	/**
	 * {@value}
	 */
	private static final String TAG = VersionTextView.class.getSimpleName();

	/**
	 * {@value}
	 */
	private static final String VERSION_NUMBER_PREFIX = "v";

	/**
	 * {@value}
	 */
	private static final String VERSION_NUMBER_DEFAULT = "0.1";

	public VersionTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setText(VERSION_NUMBER_PREFIX + getVersionName(context));
	}

	private String getVersionName(Context context) {
		try {
			return context.getPackageManager().getPackageInfo(
					context.getPackageName(), 0).versionName;
		} catch (NameNotFoundException e) {
			Log.e(TAG, e.getMessage(), e);
			return VERSION_NUMBER_DEFAULT;
		}
	}

	public VersionTextView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public VersionTextView(Context context) {
		this(context, null);
	}

}
