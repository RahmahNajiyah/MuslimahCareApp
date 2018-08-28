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
 * Created by User on 3/8/2018.
 */

public class AdapterMalam7 extends PagerAdapter {

    Context context;
    String[] isi;
    LayoutInflater layoutInflater;

    public AdapterMalam7(Context context, String[] isi) {
        this.context = context;
        this.isi = isi;
    }

    @Override
    public int getCount() {
        return isi.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ScrollView) object) ;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textm7;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View m7 = layoutInflater.inflate(R.layout.isim7, container, false);
        textm7 = (TextView) m7.findViewById(R.id.textm7);

        ((ViewPager) container).addView(m7);
        return m7;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ScrollView) object);
    }
}
