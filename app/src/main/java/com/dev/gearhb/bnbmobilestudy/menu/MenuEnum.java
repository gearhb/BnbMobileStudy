package com.dev.gearhb.bnbmobilestudy.menu;

import com.dev.gearhb.bnbmobilestudy.chapter.Ch10HandlerOrder;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch10KeyboardInput;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch10ScreenTouchInput;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch11Timer;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch11Widget;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch11Widget2;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch12CallActivity;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch12Intent;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch13ListView;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch13ListView2;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch12SubActivity;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch13ListView3;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch13Spinner;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch14AlertDialog;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch14AlertDialog2;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch14AlertDialog3;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch15AlertDialog;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch15AlertDialog2;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch7ChangeAttributes;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch7PiledLayout;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch7PiledLayout2;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch7TableLayout;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch8Canvas;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch8CustomView;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch8Paint;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch8Paint2;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch8SoundOutput;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch8Toast;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch9CallbackMethod;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch9ListenerInterface;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch9ListenerView;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch9Listeneractivity;

/**
 * Created by hb_c on 2018. 5. 6..
 */

public enum MenuEnum {

    // 리스트에 표시될 이름, 해당 클레스

    ALERTDIALOG5("15강 AlertDialog2",Ch15AlertDialog2.class),
    ALERTDIALOG4("15강 AlertDialog",Ch15AlertDialog.class),
    ALERTDIALOG3("14강 AlertDialog3",Ch14AlertDialog3.class),
    ALERTDIALOG2("14강 AlertDialog2",Ch14AlertDialog2.class),
    ALERTDIALOG("14강 AlertDialog",Ch14AlertDialog.class),
    SPINNER("13강 Spinner",Ch13Spinner.class),
    LISTVIEW3("13강 ListView3",Ch13ListView3.class),
    LISTVIEW2("13강 ListView2",Ch13ListView2.class),
    INTENT("12강 Intent",Ch12Intent.class),
    LISTVIEW("13강 ListView",Ch13ListView.class),
    CALLACTIVITY("12강 CallActivity",Ch12CallActivity.class),
    SUBACTIVITY("12강 SubActivity",Ch12SubActivity.class),
    TIMER("11강 Timer", Ch11Timer.class),
    WIDGET2("11강 Widget2", Ch11Widget2.class),
    WIDGET("11강 Widget", Ch11Widget.class),
    SCREENTOUCHINPUT("11강 ScreenTouchInput", Ch10ScreenTouchInput.class),
    KEYBOARDINPUT("11강 KeyboardInput",Ch10KeyboardInput.class),
    HANDLERORDER("10강 HandlerOrder", Ch10HandlerOrder.class),
    LISTENERVIEW("9강 ListenerView",Ch9ListenerView.class),
    LISTENERINTERFACE("9강 ListenerInterface", Ch9ListenerInterface.class),
    LISTENERACTIVITY("9강 ListenerActivity", Ch9Listeneractivity.class),
    CALLBACKMETHOD("9강 CallBackMethod", Ch9CallbackMethod.class),
    TOAST("8강 Toast",Ch8Toast.class),
    SOUNDOUTPUT("8강 SoundOutPut", Ch8SoundOutput.class),
    PAINT2("8강 Paint2", Ch8Paint2.class),
    PAINT("8강 Paint", Ch8Paint.class),
    CUSTOMVIEW("8강 CustomView", Ch8CustomView.class),
    CANVAS("8강 Canvas", Ch8Canvas.class),
    PILEDLAYOUT2("7강 PiledLayoyt2",Ch7PiledLayout2.class),
    PILEDLAYOUT("7강 PiledLayoyt",Ch7PiledLayout.class),
    TABLELAYOUT("7강 TableLayout", Ch7TableLayout.class),
    CHANGEATTRIBUTES("7강 ChangeAttributes", Ch7ChangeAttributes.class);


    private String m_name;
    private Class m_cls;

    MenuEnum(String a_name, Class a_cls)
    {
        this.m_name = a_name;
        this.m_cls = a_cls;
    }

    public String getMenuName()
    {
        return m_name;
    }

    public Class getMenuClass()
    {
        return m_cls;
    }


}
