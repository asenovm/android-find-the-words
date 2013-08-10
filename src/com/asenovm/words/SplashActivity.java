package com.asenovm.words;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class SplashActivity extends Activity {

	/**
	 * {@value}
	 */
	private static final int PERIOD_TICK = 100;

	/**
	 * {@value}
	 */
	private static final int PERIOD_TIMER = 2000;

	private class SplashCountDownTimer extends CountDownTimer {

		public SplashCountDownTimer(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
		}

		@Override
		public void onFinish() {
			finish();
			startHomeActivity();
		}

		private void startHomeActivity() {
			startActivity(new Intent(SplashActivity.this, HomeActivity.class));
		}

		@Override
		public void onTick(long millisUntilFinished) {
			// blank
		}

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		startTimer();
	}

	private void startTimer() {
		new SplashCountDownTimer(PERIOD_TIMER, PERIOD_TICK).start();
	}

}
