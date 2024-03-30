package X;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0W4  reason: invalid class name */
public abstract class AnonymousClass0W4 {
    public static boolean A00 = true;
    public static Method A01;
    public static boolean A02;

    public static int A00(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!A02) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class[] clsArr = new Class[2];
                Class cls2 = Integer.TYPE;
                clsArr[0] = cls2;
                Method A0H = AnonymousClass001.A0H(cls, cls2, "getChildDrawingOrder", clsArr, 1);
                A01 = A0H;
                A0H.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            A02 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                Object[] objArr = new Object[2];
                AnonymousClass000.A1L(objArr, viewGroup.getChildCount(), 0);
                AnonymousClass000.A1L(objArr, i, 1);
                return AnonymousClass000.A0I(method.invoke(viewGroup, objArr));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    public static void A01(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (A00) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
