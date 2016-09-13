package com.jack.cardviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class CircleProgressView extends View {

	private static final String TAG = "CircleProgressBar";

	private int mMaxProgress = 100;

	private double mProgress = 99;

	private final int mCircleLineStrokeWidth = 6;

	private final int mTxtStrokeWidth = 2;

	// 画圆�?在的距形区域
	private final RectF mRectF;

	private final Paint mPaint;

	private final Context mContext;

	private String mTxtHint1;

	private String mTxtHint2;

	public CircleProgressView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		mContext = context;
		mRectF = new RectF();
		mPaint = new Paint();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		int width = this.getMeasuredWidth();
		int height = this.getMeasuredHeight();

		if (width != height) {
			int min = Math.min(width, height);
			width = min;
			height = min;
		}
		// 设置画笔相关属�??
		mPaint.setAntiAlias(true);
		mPaint.setColor(Color.rgb(0xe9, 0xe9, 0xe9));
		canvas.drawColor(Color.TRANSPARENT);
		mPaint.setStrokeWidth(mCircleLineStrokeWidth);
		mPaint.setStyle(Style.STROKE);
		// 位置
		mRectF.left = mCircleLineStrokeWidth / 2; // 左上角x
		mRectF.top = mCircleLineStrokeWidth / 2; // 左上角y
		mRectF.right = width - mCircleLineStrokeWidth / 2; // 左下角x
		mRectF.bottom = height - mCircleLineStrokeWidth / 2; // 右下角y

		// 绘制圆圈，进度条背景
		canvas.drawArc(mRectF, -90, 360, false, mPaint);

		if (mProgress == 100.0) {
			mPaint.setColor(Color.LTGRAY);
			canvas.drawArc(mRectF, -90, ((float) 0.0 / mMaxProgress) * 360,
					false, mPaint);
		} else {
			mPaint.setColor(getResources().getColor(R.color.red));
			canvas.drawArc(mRectF, -90,
					((float) mProgress / mMaxProgress) * 360, false, mPaint);
		}

		int textHeight = height / 4;
		// 绘制进度文案显示
		mPaint.setStrokeWidth(0.5f);
		String text;
		if (mProgress == 100.0) {
			mPaint.setColor(getResources().getColor(R.color.assist));
			mPaint.setTextSize(height / 6);
			text = "已抢�?";
			mPaint.setStyle(Style.FILL);
			int textWidth = (int) mPaint.measureText(text, 0, text.length());
			// LogTool.ii(TAG, "文字的宽"+(width / 2 - textWidth / 2)+"文字的高"+(height
			// / 2 + textHeight / 2));
			canvas.drawText(text, width / 2 - textWidth / 2, height / 2
					+ textHeight / 4, mPaint);
		} else {

			mPaint.setColor(Color.RED);
			mPaint.setTextSize(textHeight);
			text = (int) mProgress + "%";
			int textWidth = (int) mPaint.measureText(text, 0, text.length());
			mPaint.setStyle(Style.FILL);
			// LogTool.ii(TAG, "文字的宽"+(width / 2 - textWidth / 2)+"文字的高"+(height
			// / 2 + textHeight / 2));
			// canvas.drawText("�?", width / 2 - textWidth / 2, height / 2 +
			// textHeight / 2, mPaint);
			canvas.drawText("抢", width / 2 - textWidth / 4, height / 2
					+ textHeight / 3, mPaint);

		}

		// if (!TextUtils.isEmpty(mTxtHint1)) {
		// mPaint.setStrokeWidth(mTxtStrokeWidth);
		// text = mTxtHint1;
		// textHeight = height / 8;
		// mPaint.setTextSize(textHeight);
		// mPaint.setColor(Color.rgb(0x99, 0x99, 0x99));
		// textWidth = (int) mPaint.measureText(text, 0, text.length());
		// mPaint.setStyle(Style.FILL);
		// canvas.drawText(text, width / 2 - textWidth / 2, height / 4 +
		// textHeight / 2, mPaint);
		// }
		// if (!TextUtils.isEmpty(mTxtHint2)) {
		// mPaint.setStrokeWidth(mTxtStrokeWidth);
		// text = mTxtHint2;
		// textHeight = height / 8;
		// mPaint.setTextSize(textHeight);
		// textWidth = (int) mPaint.measureText(text, 0, text.length());
		// mPaint.setStyle(Style.FILL);
		// canvas.drawText(text, width / 2 - textWidth / 2, 3 * height / 4 +
		// textHeight / 2, mPaint);
		// }

	}

	public int getMaxProgress() {
		return mMaxProgress;
	}

	public void setMaxProgress(int maxProgress) {
		this.mMaxProgress = maxProgress;
	}

	public void setProgress(Double progress) {
		this.mProgress = progress;
		this.invalidate();
	}

	public void setProgressNotInUiThread(int progress) {
		this.mProgress = progress;
		this.postInvalidate();
	}

	public String getmTxtHint1() {
		return mTxtHint1;
	}

	public void setmTxtHint1(String mTxtHint1) {
		this.mTxtHint1 = mTxtHint1;
	}

	public String getmTxtHint2() {
		return mTxtHint2;
	}

	public void setmTxtHint2(String mTxtHint2) {
		this.mTxtHint2 = mTxtHint2;
	}
}
