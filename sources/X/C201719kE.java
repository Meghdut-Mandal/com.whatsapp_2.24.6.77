package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* renamed from: X.9kE  reason: invalid class name and case insensitive filesystem */
public class C201719kE {
    public static Bundle A00(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            return bundle.deepCopy();
        }
        Parcel obtain = Parcel.obtain();
        try {
            int dataPosition = obtain.dataPosition();
            obtain.writeBundle(bundle);
            obtain.setDataPosition(dataPosition);
            Bundle A0I = C165607th.A0I(obtain, C201719kE.class);
            Objects.requireNonNull(A0I);
            return A0I;
        } finally {
            obtain.recycle();
        }
    }

    public static void A01(Class cls, Object obj, String str) {
        Class<?> cls2;
        if (obj != null && (cls2 = obj.getClass()) != cls) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Expecting: ");
            A0u.append(cls);
            A0u.append(" under key ");
            A0u.append(str);
            throw C90464aC.A0P(cls2, " but was: ", A0u);
        }
    }

    public static void A02(String str, Bundle bundle) {
        Class<byte[]> cls = byte[].class;
        Object obj = bundle.get(str);
        if (obj != null) {
            A01(cls, obj, str);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Missing required key: ");
        throw AnonymousClass000.A0c(str, A0u);
    }
}
