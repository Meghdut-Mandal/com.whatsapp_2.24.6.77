package X;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.9Yr  reason: invalid class name and case insensitive filesystem */
public abstract class C196299Yr {
    public static boolean A00(String str, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 3 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean A01(String str, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }
}
