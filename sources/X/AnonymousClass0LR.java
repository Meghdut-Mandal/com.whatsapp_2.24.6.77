package X;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* renamed from: X.0LR  reason: invalid class name */
public final class AnonymousClass0LR extends AnonymousClass0MR {
    public final Object A00;

    public static Object A00(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof AnonymousClass0LR) {
            return ((AnonymousClass0LR) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field field = null;
        int i = 0;
        for (Field field2 : asBinder.getClass().getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            AnonymousClass006.A01(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw AnonymousClass001.A08("IObjectWrapper declared field not private!");
            }
        } else {
            throw AnonymousClass000.A0d("Unexpected number of IObjectWrapper declared fields: ", AnonymousClass000.A0u(), r5);
        }
    }

    public AnonymousClass0LR(Object obj) {
        this.A00 = obj;
    }
}
