package com.rahmahnajiyahimtihan.muslimahcare;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by User on 3/6/2018.
 */

public class AdapterPagi1 extends PagerAdapter {

    Context context;
    String[] isi;
    LayoutInflater layoutInflater;

    public AdapterPagi1(Context context, String[] isi) {
        this.context = context;
        this.isi = isi;
    }

    @Override
    public int getCount() {
        return isi.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ScrollView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textcleanser;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.isipagi1, container, false);

        textcleanser = (TextView) v.findViewById(R.id.textcleanser);

        textcleanser.setText(Integer.parseInt(isi[position]));

        ((ViewPager) container).addView(v);
        return v;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ScrollView) object);
    }
}
