package X;

import android.graphics.Typeface;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1fU  reason: invalid class name and case insensitive filesystem */
public abstract class C33511fU {
    public static final Map A00 = new LinkedHashMap();

    public static final Typeface A01() {
        Typeface typeface = Typeface.SANS_SERIF;
        if (typeface == null) {
            typeface = Typeface.create("sans-serif", 0);
        }
        AnonymousClass00C.A0B(typeface);
        return typeface;
    }

    public static final void A03(TextView textView) {
        AnonymousClass00C.A0D(textView, 0);
        textView.getContext();
        textView.setTypeface(A02(), 0);
    }

    public static final Typeface A00() {
        Map map = A00;
        Object obj = map.get("sans_serif_bold");
        if (obj == null) {
            obj = Typeface.create(A01(), 1);
            AnonymousClass00C.A08(obj);
            map.put("sans_serif_bold", obj);
        }
        return (Typeface) obj;
    }

    public static final Typeface A02() {
        Map map = A00;
        Object obj = map.get("sans_serif_medium");
        if (obj == null) {
            obj = Typeface.create("sans-serif-medium", 0);
            AnonymousClass00C.A0B(obj);
            map.put("sans_serif_medium", obj);
        }
        return (Typeface) obj;
    }
}
