package com.dev.gearhb.bnbmobilestudy.menu;

/**
 * Created by hb_c on 2018. 5. 6..
 */

public class ListViewItem {
    private String m_name;
    private Class m_cls;

    public ListViewItem(String a_name, Class a_cls)
    {
        this.m_name = a_name;
        this.m_cls = a_cls;
    }

    public String getName()
    {
        return m_name;
    }

    public Class getItem()
    {
        return m_cls;
    }

}
