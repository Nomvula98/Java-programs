package com.collectionsExample;

import java.util.Comparator;

public class StringComparator implements Comparator {
    @Override
    public int compare(Object o1,Object o2){
        String astr;
        String bstr;
        astr=(String)o1;
        bstr=(String)o2;

        //reverse the comparison
        return bstr.compareTo(astr);

    }
}
