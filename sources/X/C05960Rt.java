package X;

import android.graphics.Typeface;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.0Rt  reason: invalid class name and case insensitive filesystem */
public abstract class C05960Rt {
    public static final C000700i A00 = new C000700i(3);
    public static final Object A01 = new Object();
    public static final Field A02;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception e) {
            Log.e("WeightTypeface", AnonymousClass000.A0k(e), e);
            field = null;
        }
        A02 = field;
    }
}
