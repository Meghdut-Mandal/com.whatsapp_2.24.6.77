package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.5gC  reason: invalid class name and case insensitive filesystem */
public abstract class C113835gC {
    public static Method A00;
    public static Method A01;
    public static boolean A02;

    public static final void A00(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C109045Wb.A00(canvas, z);
            return;
        }
        if (!A02) {
            if (i == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                Class<Canvas> cls = Canvas.class;
                A01 = (Method) declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                method = (Method) declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
            } else {
                Class<Canvas> cls2 = Canvas.class;
                try {
                    A01 = cls2.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    method = cls2.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            A00 = method;
            Method method2 = A01;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = A00;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            A02 = true;
        }
        if (z) {
            try {
                Method method4 = A01;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        } else {
            Method method5 = A00;
            if (method5 != null) {
                method5.invoke(canvas, new Object[0]);
            }
        }
    }
}
