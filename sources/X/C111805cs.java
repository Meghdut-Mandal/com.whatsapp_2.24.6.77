package X;

import android.os.Parcel;

/* renamed from: X.5cs  reason: invalid class name and case insensitive filesystem */
public abstract class C111805cs {
    public static boolean A01(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        return A00(parcel).booleanValue();
    }

    public static Boolean A00(Parcel parcel) {
        return Boolean.valueOf(AnonymousClass000.A1P(parcel.readByte()));
    }
}
