package X;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0V3  reason: invalid class name */
public abstract class AnonymousClass0V3 {
    public static Method A00;
    public static boolean A01;
    public static Field A02;
    public static boolean A03;

    public abstract float A00(View view);

    public abstract void A01(Matrix matrix, View view);

    public abstract void A02(Matrix matrix, View view);

    public abstract void A03(Matrix matrix, View view);

    public abstract void A04(View view, float f);

    public void A05(View view, int i) {
        if (!A03) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                A02 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            A03 = true;
        }
        Field field = A02;
        if (field != null) {
            try {
                A02.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void A06(View view, int i, int i2, int i3, int i4) {
        if (!A01) {
            Class<View> cls = View.class;
            try {
                Class[] clsArr = new Class[4];
                Class cls2 = Integer.TYPE;
                clsArr[0] = cls2;
                clsArr[1] = cls2;
                clsArr[2] = cls2;
                Method A0H = AnonymousClass001.A0H(cls, cls2, "setFrame", clsArr, 3);
                A00 = A0H;
                A0H.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            A01 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                Object[] objArr = new Object[4];
                AnonymousClass000.A1L(objArr, i, 0);
                AnonymousClass000.A1L(objArr, i2, 1);
                AnonymousClass000.A1L(objArr, i3, 2);
                AnonymousClass000.A1L(objArr, i4, 3);
                method.invoke(view, objArr);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw AnonymousClass001.A0B(e2.getCause());
            }
        }
    }
}
