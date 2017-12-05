package com.retailservices.camcp.ctbook.Register;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.retailservices.camcp.ctbook.R;

public class Register extends Fragment {

    //region Vistas
    private TabLayout tabLayout;
    private ViewPager viewPager;
    //endregion

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        tabLayout = (TabLayout)view.findViewById(R.id.tablRegister);
        viewPager = (ViewPager)view.findViewById(R.id.vpRegister);

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(new RegisterAdapter(getChildFragmentManager()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position==0){
//                    setTitle("Login");
                }else if(position==1){
//                    setTitle("RegistroUser");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return view;
    }
}
