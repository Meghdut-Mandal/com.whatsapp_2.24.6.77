package X;

import android.content.res.XmlResourceParser;
import java.util.ArrayList;

/* renamed from: X.6In  reason: invalid class name and case insensitive filesystem */
public abstract class C129806In {
    public static final Object A00 = C36441kJ.A11();
    public static volatile ArrayList A01;

    public static String A00(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlResourceParser.getAttributeValue((String) null, str);
        }
        return attributeValue;
    }
}
