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
 * Created by User on 3/6/2018.
 */

public class AdapterPagi3 extends PagerAdapter {

    Context context;
    String[] isi;
    LayoutInflater layoutInflater;

    public AdapterPagi3(Context context, String[] isi) {
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
        TextView textserum;

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View najiyah = layoutInflater.inflate(R.layout.isipagi3, container,false);

        textserum = (TextView) najiyah.findViewById(R.id.textserum);

        textserum.setText(Integer.parseInt(isi[position]));

        ((ViewPager) container).addView(najiyah);
        return najiyah;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ScrollView) object);
    }
}
