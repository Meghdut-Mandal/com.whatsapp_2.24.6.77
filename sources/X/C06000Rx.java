package X;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.0Rx  reason: invalid class name and case insensitive filesystem */
public abstract class C06000Rx {
    public static Field A00;
    public static Field A01;
    public static Field A02;
    public static boolean A03 = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            A02 = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            A01 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            A00 = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Failed to get visible insets from AttachInfo ");
            Log.w("WindowInsetsCompat", AnonymousClass000.A0q(e.getMessage(), A0u), e);
        }
    }
}
