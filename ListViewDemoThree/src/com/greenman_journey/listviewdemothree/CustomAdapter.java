package com.greenman_journey.listviewdemothree;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * This class is used as Adapter class to populate given data/
 * @author Sumit
 *
 */
public class CustomAdapter extends BaseAdapter {

	//Local params
	private ArrayList<ScientistRecord> list = null;
	private Context context = null;

	public CustomAdapter(Context context, ArrayList<ScientistRecord> list) {
		super();
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		PlaceHolder placeHolder;
		if (convertView == null) {

			placeHolder = new PlaceHolder();
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.child_custom_view, parent,
					false);
			placeHolder.scientistNameTextView = (TextView) convertView
					.findViewById(R.id.textView_ScientistName);
			placeHolder.awardNameTextView = (TextView) convertView
					.findViewById(R.id.textView_Award);
			placeHolder.yearOfAwardTextView = (TextView) convertView
					.findViewById(R.id.textView_Year);

			convertView.setTag(placeHolder);

		} else {
			placeHolder = (PlaceHolder) convertView.getTag();
		}

		ScientistRecord record = list.get(position);
		placeHolder.scientistNameTextView.setText(record.getScientistName());
		placeHolder.awardNameTextView.setText(record.getAwardName());
		placeHolder.yearOfAwardTextView.setText(record.getYearOfAward());

		return convertView;
	}

	class PlaceHolder {
		TextView scientistNameTextView;
		TextView awardNameTextView;
		TextView yearOfAwardTextView;
	}
}
