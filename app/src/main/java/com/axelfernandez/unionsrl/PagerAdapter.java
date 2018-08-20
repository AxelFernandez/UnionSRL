package com.axelfernandez.unionsrl;

import java.util.ArrayList;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import in.galaxyofandroid.awesometablayout.AwesomeTabBarAdapter;

public class PagerAdapter extends AwesomeTabBarAdapter
{
    ArrayList<Fragment> fragments=new ArrayList<>();
    ArrayList<String> titles=new ArrayList<>();
    int[] colors={R.color.colorPrimary,R.color.colorPrimary,R.color.colorPrimary};
    int[] textColors={R.color.colorwithe};

    public PagerAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);

        fragments.add(new FragmentSemana());
        fragments.add(new FragmentSabado());
        fragments.add(new FragmentDomingo());
        titles.add("Lunes - Viernes");
        titles.add("Sabado");
        titles.add("Domingo y Feriados");


    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getColorResource(int position) {
        return colors[position];
    }

    @Override
    public int getTextColorResource(int position) {
        return textColors[0];
    }

    @Override
    public int getIconResource(int position) {
        return 0;
    }
}