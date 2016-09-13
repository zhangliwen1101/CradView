package com.jack.cardviewdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class MainActivity extends Activity {
	private CardView cardView;
	private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cardView = (CardView) findViewById(R.id.cardview);
		initview();
	}

	private void initview() {
		cardView.setItemSpace(Utils.convertDpToPixelInt(this, 20));
		MyCardAdapter adapter = new MyCardAdapter(this);
		cardView.setAdapter(adapter);
	}

	public class MyCardAdapter extends CardAdapter {

		public MyCardAdapter(Context context) {
			super(context);
		}

		@Override
		public int getCount() {
			return Integer.MAX_VALUE;
		}

		@Override
		protected View getCardView(final int position, View convertView,
				ViewGroup parent) {

			if (convertView == null) {
				LayoutInflater inflater = LayoutInflater
						.from(MainActivity.this);
				convertView = inflater.inflate(R.layout.item_layout, parent,
						false);
			}

			/**
			 * private productDetail product1; private productDetail product2;
			 * private productDetail product3;
			 */
			// ((TextView)convertView.findViewById(R.id.show_title)).setText("1");
			// ((TextView) convertView.findViewById(R.id.earnings))
			// .setTextColor(getResources()
			// .getColor(R.color.home_earnings));
			// ((TextView) convertView.findViewById(R.id.baifenhao))
			// .setTextColor(getResources()
			// .getColor(R.color.home_earnings));
			// ((TextView) convertView.findViewById(R.id.month))
			// .setTextColor(getResources().getColor(R.color.home_money));
			// ((TextView) convertView.findViewById(R.id.deadline))
			// .setTextColor(getResources().getColor(
			// R.color.home_card_text));
			// ((TextView) convertView.findViewById(R.id.show_title))
			// .setTextColor(getResources().getColor(
			// R.color.home_card_text));
			// ((TextView) convertView.findViewById(R.id.tbqx))
			// .setTextColor(getResources().getColor(
			// R.color.home_card_text));
			// switch (position%3) {
			// case 0:
			// ((TextView)convertView.findViewById(R.id.show_title)).setText(product3.getProduct_name());
			// ((TextView)convertView.findViewById(R.id.earnings)).setText(f.format(Double.parseDouble(product3.getRate())
			// * 100) + "");
			// ((TextView)
			// convertView.findViewById(R.id.tbqx)).setText(product3.getMin_money()+"元起投");
			// ((TextView)convertView.findViewById(R.id.month)).setText(product3.getLimit_time());
			// double fintotal3 =
			// Double.parseDouble(product3.getTotal_money_yes())/Double.parseDouble(product3.getTotal_money())*100;
			// ((CircleProgressView)convertView.findViewById(R.id.circleProgressbar)).setProgress(Double.parseDouble(f.format(fintotal3)));
			// if (fintotal3==100.00) {
			// ((TextView)convertView.findViewById(R.id.qiang)).setVisibility(View.GONE);
			// ((TextView)convertView.findViewById(R.id.earnings)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.baifenhao)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.month)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.deadline)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.show_title)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.tbqx)).setTextColor(getResources().getColor(R.color.project_text_color));
			// }
			// break;
			// case 1:
			// ((TextView)convertView.findViewById(R.id.show_title)).setText(product1.getProduct_name());
			// ((TextView)convertView.findViewById(R.id.earnings)).setText(f.format(Double.parseDouble(product1.getRate())
			// * 100) + "");
			// ((TextView)
			// convertView.findViewById(R.id.tbqx)).setText(product1.getMin_money()+"元起投");
			// ((TextView)convertView.findViewById(R.id.month)).setText(product1.getLimit_time());
			// double fintotal1 =
			// Double.parseDouble(product1.getTotal_money_yes())/Double.parseDouble(product1.getTotal_money())*100;
			// ((CircleProgressView)convertView.findViewById(R.id.circleProgressbar)).setProgress(Double.parseDouble(f.format(fintotal1)));
			// if (fintotal1==100.00) {
			// ((TextView)convertView.findViewById(R.id.qiang)).setVisibility(View.GONE);
			// ((TextView)convertView.findViewById(R.id.earnings)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.baifenhao)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.month)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.deadline)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.show_title)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.tbqx)).setTextColor(getResources().getColor(R.color.project_text_color));
			// }
			// break;
			// case 2:
			// ((TextView)convertView.findViewById(R.id.show_title)).setText(product2.getProduct_name());
			// ((TextView)convertView.findViewById(R.id.earnings)).setText(f.format(Double.parseDouble(product2.getRate())
			// * 100) + "");
			// ((TextView)
			// convertView.findViewById(R.id.tbqx)).setText(product2.getMin_money()+"元起投");
			// ((TextView)convertView.findViewById(R.id.month)).setText(product2.getLimit_time());
			// double fintotal2 =
			// Double.parseDouble(product2.getTotal_money_yes())/Double.parseDouble(product2.getTotal_money())*100;
			// ((CircleProgressView)convertView.findViewById(R.id.circleProgressbar)).setProgress(Double.parseDouble(f.format(fintotal2)));
			// if (fintotal2==100.00) {
			// ((TextView)convertView.findViewById(R.id.qiang)).setVisibility(View.GONE);
			// ((TextView)convertView.findViewById(R.id.earnings)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.baifenhao)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.month)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.deadline)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.show_title)).setTextColor(getResources().getColor(R.color.project_text_color));
			// ((TextView)convertView.findViewById(R.id.tbqx)).setTextColor(getResources().getColor(R.color.project_text_color));
			// }
			// break;
			// default:
			// break;
			// }

			convertView.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// LogTool.ii(TAG, "你点击的是:"+position%3);
					switch (position % 3) {
					case 0:
						intent = new Intent(getApplicationContext(),
								OtherActivity.class);
						// intent.putExtra("pid", type3_pid + "");
						startActivity(intent);
						break;
					case 1:
						intent = new Intent(getApplicationContext(),
								OtherActivity.class);
						// intent.putExtra("pid", type1_pid + "");
						startActivity(intent);
						break;
					case 2:
						intent = new Intent(getApplicationContext(),
								OtherActivity.class);
						// intent.putExtra("pid", type2_pid + "");
						startActivity(intent);
						break;
					default:
						break;
					}
				}
			});
			return convertView;
		}

	}
}
