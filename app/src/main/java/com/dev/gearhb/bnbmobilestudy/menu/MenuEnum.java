package com.dev.gearhb.bnbmobilestudy.menu;

import com.dev.gearhb.bnbmobilestudy.chapter.Ch10HandlerOrder;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch10KeyboardInput;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch10ScreenTouchInput;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch11Timer;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch11Widget;
import com.dev.gearhb.bnbmobilestudy.chapter.Ch11Widget2;
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
    CHANGEATTRIBUTES("7강 ChangeAttributes", Ch7ChangeAttributes.class),
    TABLELAYOUT("7강 TableLayout", Ch7TableLayout.class),
    PILEDLAYOUT("7강 PiledLayoyt",Ch7PiledLayout.class),
    PILEDLAYOUT2("7강 PiledLayoyt2",Ch7PiledLayout2.class),
    CANVAS("8강 Canvas", Ch8Canvas.class),
    CUSTOMVIEW("8강 CustomView", Ch8CustomView.class),
    PAINT("8강 Paint", Ch8Paint.class),
    PAINT2("8강 Paint2", Ch8Paint2.class),
    SOUNDOUTPUT("8강 SoundOutPut", Ch8SoundOutput.class),
    TOAST("8강 Toast",Ch8Toast.class),
    CALLBACKMETHOD("9강 CallBackMethod", Ch9CallbackMethod.class),
    LISTENERACTIVITY("9강 ListenerActivity", Ch9Listeneractivity.class),
    LISTENERINTERFACE("9강 ListenerInterface", Ch9ListenerInterface.class),
    LISTENERVIEW("9강 ListenerView",Ch9ListenerView.class),
    HANDLERORDER("10강 HandlerOrder", Ch10HandlerOrder.class),
    KEYBOARDINPUT("11강 KeyboardInput",Ch10KeyboardInput.class),
    SCREENTOUCHINPUT("11강 ScreenTouchInput", Ch10ScreenTouchInput.class),
    WIDGET("11강 Widget", Ch11Widget.class),
    WIDGET2("11강 Widget2", Ch11Widget2.class),
    TIMER("11강 Timer", Ch11Timer.class);

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
