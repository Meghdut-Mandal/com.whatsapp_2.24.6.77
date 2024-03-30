package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.0Pq  reason: invalid class name and case insensitive filesystem */
public abstract class C05420Pq {
    public static Object A00(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C05410Pp.A00(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (!cls.isInstance(parcelable)) {
            return null;
        }
        return parcelable;
    }
}
