package com.jack.cardviewdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public abstract class CardAdapter extends BaseCardAdapter {
	private final Context mContext;

	private ArrayList<View> mData;

	public CardAdapter(Context context) {
		mContext = context;
		mData = new ArrayList<View>();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		FrameLayout wrapper = (FrameLayout) convertView;
		View cardView;
		View convertedCardView;
		if (wrapper == null) {
			wrapper = new FrameLayout(mContext);
			wrapper.setBackgroundResource(R.drawable.sy_touzikapian);
			cardView = getCardView(position, null, wrapper);
			wrapper.addView(cardView);
		} else {
			cardView = wrapper.getChildAt(0);
			convertedCardView = getCardView(position, cardView, wrapper);
			//要先删除，然后再添加，否则界面不更新
			wrapper.removeView(cardView);
			wrapper.addView(convertedCardView);
			if (convertedCardView != cardView) {
			}
		}
		return wrapper;
	}

	protected abstract View getCardView(int position, View convertView, ViewGroup parent);

	public void addAll(ArrayList<View> items){
		mData.addAll(items);
	}
	
	@Override
	public View getItem(int position) {
		return mData.get(position);
	}

	@Override
	public int getCount() {
		return mData.size();
	}

	@Override
	public long getItemId(int position) {
		return getItem(position).hashCode();
	}

	public Context getContext() {
		return mContext;
	}
	
	public void clear(){
		if(mData != null){
			mData.clear();
		}
	}
}
