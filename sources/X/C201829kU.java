package X;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9kU  reason: invalid class name and case insensitive filesystem */
public final class C201829kU {
    public static final ClassLoader A00 = C201829kU.class.getClassLoader();

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        return AnonymousClass000.A0W(parcel, creator);
    }

    public static void A01(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(AnonymousClass000.A0r("Parcel data not fully consumed, unread size: ", AnonymousClass000.A0u(), dataAvail));
        }
    }
}
