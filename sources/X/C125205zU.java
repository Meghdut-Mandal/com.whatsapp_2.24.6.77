package X;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.5zU  reason: invalid class name and case insensitive filesystem */
public final class C125205zU {
    public final void A00(View view) {
        Field field;
        try {
            if (!C92324da.A0H) {
                C92324da.A0H = true;
                if (Build.VERSION.SDK_INT < 28) {
                    Class<View> cls = View.class;
                    C92324da.A0G = cls.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    field = cls.getDeclaredField("mRecreateDisplayList");
                } else {
                    Class<Class> cls2 = Class.class;
                    Class<String> cls3 = String.class;
                    Class<View> cls4 = View.class;
                    C92324da.A0G = (Method) cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{cls3, new Class[0].getClass()}).invoke(cls4, new Object[]{"updateDisplayListIfDirty", new Class[0]});
                    field = (Field) cls2.getDeclaredMethod("getDeclaredField", new Class[]{cls3}).invoke(cls4, new Object[]{"mRecreateDisplayList"});
                }
                C92324da.A0F = field;
                Method method = C92324da.A0G;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field2 = C92324da.A0F;
                if (field2 != null) {
                    field2.setAccessible(true);
                }
            }
            Field field3 = C92324da.A0F;
            if (field3 != null) {
                field3.setBoolean(view, true);
            }
            Method method2 = C92324da.A0G;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            C92324da.A0I = true;
        }
    }
}
