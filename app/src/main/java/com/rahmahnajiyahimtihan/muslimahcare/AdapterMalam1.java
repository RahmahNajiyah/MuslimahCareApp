package com.rahmahnajiyahimtihan.muslimahcare;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by User on 3/7/2018.
 */

public class AdapterMalam1 extends PagerAdapter {

    Context context;
    String[] isi;
    LayoutInflater layoutInflater;

    public AdapterMalam1(Context context, String[] isi) {
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

        TextView textm1;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View m1 = layoutInflater.inflate(R.layout.isimalam1, container, false);
        textm1 = (TextView) m1.findViewById(R.id.textm1);
        textm1.setText(Integer.parseInt(isi[position]));

        ((ViewPager) container).addView(m1);
        return m1;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ScrollView)object);
    }
}
