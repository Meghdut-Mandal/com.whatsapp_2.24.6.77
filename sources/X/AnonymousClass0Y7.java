package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Y7  reason: invalid class name */
public class AnonymousClass0Y7 {
    public String A00;
    public float A01;
    public int A02;
    public int A03;
    public Integer A04;
    public String A05;
    public boolean A06;

    public void A01(Object obj) {
        switch (this.A04.intValue()) {
            case 0:
                this.A03 = AnonymousClass000.A0I(obj);
                return;
            case 1:
            case 6:
                this.A01 = ((Number) obj).floatValue();
                return;
            case 2:
            case 3:
                this.A02 = AnonymousClass000.A0I(obj);
                return;
            case 4:
                this.A05 = (String) obj;
                return;
            case 5:
                this.A06 = AnonymousClass000.A1X(obj);
                return;
            default:
                return;
        }
    }

    public AnonymousClass0Y7(AnonymousClass0Y7 r2, Object obj) {
        this.A00 = r2.A00;
        this.A04 = r2.A04;
        A01(obj);
    }

    public static void A00(Context context, HashMap hashMap, XmlPullParser xmlPullParser) {
        int integer;
        Integer num;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C33961gD.A02);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        Integer num2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append(Character.toUpperCase(str.charAt(0)));
                    str = AnonymousClass000.A0q(str.substring(1), A0u);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                num2 = C023109s.A0S;
            } else {
                if (index == 3) {
                    num2 = C023109s.A0C;
                } else if (index == 2) {
                    num2 = C023109s.A0G;
                } else {
                    if (index == 7) {
                        num = C023109s.A0V;
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), AnonymousClass000.A0X(context));
                    } else if (index == 4) {
                        num = C023109s.A0V;
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == 5) {
                        num = C023109s.A01;
                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == 6) {
                        num2 = C023109s.A00;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        obj = Integer.valueOf(integer);
                    } else if (index == 8) {
                        num2 = C023109s.A0R;
                        obj = obtainStyledAttributes.getString(index);
                    }
                    obj = Float.valueOf(f);
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(integer);
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new AnonymousClass0Y7(num2, obj, str));
        }
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass0Y7(Integer num, Object obj, String str) {
        this.A00 = str;
        this.A04 = num;
        A01(obj);
    }
}
