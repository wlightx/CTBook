package com.retailservices.camcp.ctbook.Register;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by camcp on 12-06-2017.
 */

public class RegisterAdapter extends FragmentPagerAdapter {


    public RegisterAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0){
//            return new RegistroUser();
        }else if (position ==1){
//            return new RegistroSucursal();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Registrar Usuario";
        }else if (position == 1){
            return "Registrar Sucursal";
        }

        return null;
    }
}

